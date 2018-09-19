package com.github.alexanderwe.bananaj.connection;

import com.github.alexanderwe.bananaj.exceptions.TransportException;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;


public class Connection implements Closeable{
	private final CloseableHttpClient httpclient;

	public Connection() {
		this.httpclient = HttpClients
				.custom()
				.setConnectionTimeToLive(1, TimeUnit.DAYS)
				.setMaxConnPerRoute(1000)
				.setMaxConnTotal(10000)
				.build();
	}

	@Override
	public void close() throws IOException {
		httpclient.close();
	}


	public String do_Get(final URL url, final String authorization) throws TransportException, URISyntaxException {
		final HttpGet httpget = new HttpGet(url.toURI());
		httpget.addHeader("Authorization", authorization);
		try (final CloseableHttpResponse response = httpclient.execute(httpget)) {
			final int responseCode = response.getStatusLine().getStatusCode();
			if (responseCode < 200 || responseCode > 299) {
				throw buildTransportError("GET", url.toExternalForm(), response);
			}
			return createResponseFromEntity(response.getEntity());
		} catch (final Exception e) {
			throw new TransportException("GET " + url.toExternalForm() + " failed", e);
		}
	}

	public String do_Post(final URL url, String post_string, final String authorization) throws TransportException, URISyntaxException {
		final HttpPost httppost = new HttpPost(url.toURI());
		httppost.addHeader("Content-Type", "application/json; charset=UTF-8");
		httppost.addHeader("Authorization", authorization);
		httppost.setEntity(EntityBuilder.create().setBinary(post_string.getBytes(StandardCharsets.UTF_8)).build());
		try (final CloseableHttpResponse response = httpclient.execute(httppost)) {
			int responseCode = response.getStatusLine().getStatusCode();
			if (responseCode < 200 || responseCode > 299) {
				throw buildTransportError("POST", url.toExternalForm(), response);
			}
			return createResponseFromEntity(response.getEntity());
		} catch (final Exception e) {
			throw new TransportException("POST " + post_string.length() + " bytes to " + url.toExternalForm() + " failed", e);
		}
	}

	public String do_Patch(final URL url, final String patch_string, final String authorization) throws TransportException, URISyntaxException {
		final HttpPatch httppatch = new HttpPatch(url.toURI());
		httppatch.addHeader("Content-Type", "application/json; charset=UTF-8");
		httppatch.addHeader("Authorization", authorization);
		httppatch.setEntity(EntityBuilder.create().setBinary(patch_string.getBytes(StandardCharsets.UTF_8)).build());
		try (final CloseableHttpResponse response = httpclient.execute(httppatch)) {
			final int responseCode = response.getStatusLine().getStatusCode();
			if (responseCode < 200 || responseCode > 299) {
				throw buildTransportError("PATCH", url.toExternalForm(), response);
			}
			return createResponseFromEntity(response.getEntity());
		} catch (final Exception e) {
			throw new TransportException("PATCH " + patch_string.length() + " bytes to " + url.toExternalForm() + " failed", e);
		}
	}


	public final String do_Put(final URL url, final String put_string, final String authorization) throws TransportException, URISyntaxException {
		final HttpPut httpput = new HttpPut(url.toURI());
		httpput.addHeader("Content-Type", "application/json; charset=UTF-8");
		httpput.addHeader("Authorization", authorization);
		httpput.setEntity(EntityBuilder.create().setBinary(put_string.getBytes(StandardCharsets.UTF_8)).build());
		try (final CloseableHttpResponse response = httpclient.execute(httpput)) {
			final int responseCode = response.getStatusLine().getStatusCode();
			if (responseCode < 200 || responseCode > 299) {
				throw buildTransportError("DELETE", url.toExternalForm(), response);
			}
			return createResponseFromEntity(response.getEntity());
		} catch (final Exception e) {
			throw new TransportException("PUT " + put_string.length() + " bytes to " + url.toExternalForm() + " failed", e);
		}
	}

	public String do_Post(final URL url, final String authorization) throws TransportException, URISyntaxException {
		final HttpPost httppost = new HttpPost(url.toURI());
		httppost.addHeader("Content-Type", "application/json; charset=UTF-8");
		httppost.addHeader("Authorization", authorization);
		try (final CloseableHttpResponse response = httpclient.execute(httppost)) {
			final int responseCode = response.getStatusLine().getStatusCode();
			if (responseCode < 200 || responseCode > 299) {
				throw buildTransportError("POST", url.toExternalForm(), response);
			}
			return createResponseFromEntity(response.getEntity());
		} catch (final Exception e) {
			throw new TransportException("POST " + url.toExternalForm() + " failed", e);
		}
	}

	public String do_Delete(final URL url, final String authorization) throws TransportException, URISyntaxException {
		final HttpDelete httpdelete = new HttpDelete(url.toURI());
		httpdelete.addHeader("Content-Type", "application/json; charset=UTF-8");
		httpdelete.addHeader("Authorization", authorization);
		try (final CloseableHttpResponse response = httpclient.execute(httpdelete)) {
			final int responseCode = response.getStatusLine().getStatusCode();
			if (responseCode < 200 || responseCode > 299) {
				throw buildTransportError("DELETE", url.toExternalForm(), response);
			}
			return createResponseFromEntity(response.getEntity());
		} catch (final Exception e) {
			throw new TransportException("DELETE " + url.toExternalForm() + " failed", e);
		}
	}

	private String createResponseFromEntity(final HttpEntity entity) throws IOException {
		if (entity != null) {
			final long length = entity.getContentLength();
			final InputStream entityStream = entity.getContent();
			final StringBuilder strbuilder = new StringBuilder(length > 16 && length < Integer.MAX_VALUE ? (int) length : 200);
			try (final Reader reader = new BufferedReader(new InputStreamReader(entityStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
				int c;
				while ((c = reader.read()) != -1) 
					strbuilder.append((char) c);
			}
			return strbuilder.toString();
		}
		return null;
	}

	private TransportException buildTransportError(final String verb, final String url, final CloseableHttpResponse response) {
		final int responseCode = response.getStatusLine().getStatusCode();
		try {
			final JSONObject errObj = new JSONObject(createResponseFromEntity(response.getEntity()));
			final String errType = getErrorObjString(errObj, "type");
			final String errTitle = getErrorObjString(errObj, "title");
			final String errDetail = getErrorObjString(errObj, "detail");
			final String errInstance = getErrorObjString(errObj, "instance");
			return new TransportException("Status: " + Integer.toString(responseCode) + " " + verb + ": " + url + " Reason: " + response.getStatusLine().getReasonPhrase()
					+ " - " + errTitle + " Details: " + errDetail + " Instance: " + errInstance + " Type: " + errType);
		} catch (IOException | JSONException e) {
			e.printStackTrace();
		}
		return new TransportException("Status: " + Integer.toString(responseCode) + " " + verb + ": " + url + " Reason: " + response.getStatusLine().getReasonPhrase());
	}


	private String getErrorObjString(final JSONObject errObj, final String key) {
		if (errObj.has(key)) {
			return errObj.getString(key);
		}
		return "";
	}
}

