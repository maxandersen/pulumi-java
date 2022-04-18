// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.cloudtasks_v2.enums.HttpRequestHttpMethod;
import com.pulumi.googlenative.cloudtasks_v2.inputs.OAuthTokenArgs;
import com.pulumi.googlenative.cloudtasks_v2.inputs.OidcTokenArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HTTP request. The task will be pushed to the worker as an HTTP request. If the worker or the redirected worker acknowledges the task by returning a successful HTTP response code ([`200` - `299`]), the task will be removed from the queue. If any other HTTP response code is returned or no response is received, the task will be retried according to the following: * User-specified throttling: retry configuration, rate limits, and the queue's state. * System throttling: To prevent the worker from overloading, Cloud Tasks may temporarily reduce the queue's effective rate. User-specified settings will not be changed. System throttling happens because: * Cloud Tasks backs off on all errors. Normally the backoff specified in rate limits will be used. But if the worker returns `429` (Too Many Requests), `503` (Service Unavailable), or the rate of errors is high, Cloud Tasks will use a higher backoff rate. The retry specified in the `Retry-After` HTTP response header is considered. * To prevent traffic spikes and to smooth sudden increases in traffic, dispatches ramp up slowly when the queue is newly created or idle and if large numbers of tasks suddenly become available to dispatch (due to spikes in create task rates, the queue being unpaused, or many tasks that are scheduled at the same time).
 * 
 */
public final class HttpRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRequestArgs Empty = new HttpRequestArgs();

    /**
     * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a task with an incompatible HttpMethod.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<String> body;

    public Output<String> body() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. These headers represent a subset of the headers that will accompany the task's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `"Google-Cloud-Tasks"`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won't be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `"application/octet-stream"` or `"application/json"`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<Map<String,String>> headers;

    public Output<Map<String,String>> headers() {
        return this.headers == null ? Codegen.empty() : this.headers;
    }

    /**
     * The HTTP method to use for the request. The default is POST.
     * 
     */
    @Import(name="httpMethod")
      private final @Nullable Output<HttpRequestHttpMethod> httpMethod;

    public Output<HttpRequestHttpMethod> httpMethod() {
        return this.httpMethod == null ? Codegen.empty() : this.httpMethod;
    }

    /**
     * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    @Import(name="oauthToken")
      private final @Nullable Output<OAuthTokenArgs> oauthToken;

    public Output<OAuthTokenArgs> oauthToken() {
        return this.oauthToken == null ? Codegen.empty() : this.oauthToken;
    }

    /**
     * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    @Import(name="oidcToken")
      private final @Nullable Output<OidcTokenArgs> oidcToken;

    public Output<OidcTokenArgs> oidcToken() {
        return this.oidcToken == null ? Codegen.empty() : this.oidcToken;
    }

    /**
     * The full url path that the request will be sent to. This string must begin with either "http://" or "https://". Some examples are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Tasks will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding. The `Location` header response from a redirect response [`300` - `399`] may be followed. The redirect is not counted as a separate attempt.
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    public HttpRequestArgs(
        @Nullable Output<String> body,
        @Nullable Output<Map<String,String>> headers,
        @Nullable Output<HttpRequestHttpMethod> httpMethod,
        @Nullable Output<OAuthTokenArgs> oauthToken,
        @Nullable Output<OidcTokenArgs> oidcToken,
        Output<String> url) {
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.oauthToken = oauthToken;
        this.oidcToken = oidcToken;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private HttpRequestArgs() {
        this.body = Codegen.empty();
        this.headers = Codegen.empty();
        this.httpMethod = Codegen.empty();
        this.oauthToken = Codegen.empty();
        this.oidcToken = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> body;
        private @Nullable Output<Map<String,String>> headers;
        private @Nullable Output<HttpRequestHttpMethod> httpMethod;
        private @Nullable Output<OAuthTokenArgs> oauthToken;
        private @Nullable Output<OidcTokenArgs> oidcToken;
        private Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oauthToken = defaults.oauthToken;
    	      this.oidcToken = defaults.oidcToken;
    	      this.url = defaults.url;
        }

        public Builder body(@Nullable Output<String> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable String body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = Codegen.ofNullable(headers);
            return this;
        }
        public Builder httpMethod(@Nullable Output<HttpRequestHttpMethod> httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public Builder httpMethod(@Nullable HttpRequestHttpMethod httpMethod) {
            this.httpMethod = Codegen.ofNullable(httpMethod);
            return this;
        }
        public Builder oauthToken(@Nullable Output<OAuthTokenArgs> oauthToken) {
            this.oauthToken = oauthToken;
            return this;
        }
        public Builder oauthToken(@Nullable OAuthTokenArgs oauthToken) {
            this.oauthToken = Codegen.ofNullable(oauthToken);
            return this;
        }
        public Builder oidcToken(@Nullable Output<OidcTokenArgs> oidcToken) {
            this.oidcToken = oidcToken;
            return this;
        }
        public Builder oidcToken(@Nullable OidcTokenArgs oidcToken) {
            this.oidcToken = Codegen.ofNullable(oidcToken);
            return this;
        }
        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }        public HttpRequestArgs build() {
            return new HttpRequestArgs(body, headers, httpMethod, oauthToken, oidcToken, url);
        }
    }
}
