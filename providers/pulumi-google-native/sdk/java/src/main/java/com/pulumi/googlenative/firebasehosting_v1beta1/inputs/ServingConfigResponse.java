// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.firebasehosting_v1beta1.inputs.HeaderResponse;
import com.pulumi.googlenative.firebasehosting_v1beta1.inputs.I18nConfigResponse;
import com.pulumi.googlenative.firebasehosting_v1beta1.inputs.RedirectResponse;
import com.pulumi.googlenative.firebasehosting_v1beta1.inputs.RewriteResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The configuration for how incoming requests to a site should be routed and processed before serving content. The URL request paths are matched against the specified URL patterns in the configuration, then Hosting applies the applicable configuration according to a specific [priority order](https://firebase.google.com/docs/hosting/full-config#hosting_priority_order).
 * 
 */
public final class ServingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServingConfigResponse Empty = new ServingConfigResponse();

    /**
     * How to handle well known App Association files.
     * 
     */
    @Import(name="appAssociation", required=true)
      private final String appAssociation;

    public String appAssociation() {
        return this.appAssociation;
    }

    /**
     * Defines whether to drop the file extension from uploaded files.
     * 
     */
    @Import(name="cleanUrls", required=true)
      private final Boolean cleanUrls;

    public Boolean cleanUrls() {
        return this.cleanUrls;
    }

    /**
     * An array of objects, where each object specifies a URL pattern that, if matched to the request URL path, triggers Hosting to apply the specified custom response headers.
     * 
     */
    @Import(name="headers", required=true)
      private final List<HeaderResponse> headers;

    public List<HeaderResponse> headers() {
        return this.headers;
    }

    /**
     * Optional. Defines i18n rewrite behavior.
     * 
     */
    @Import(name="i18n", required=true)
      private final I18nConfigResponse i18n;

    public I18nConfigResponse i18n() {
        return this.i18n;
    }

    /**
     * An array of objects (called redirect rules), where each rule specifies a URL pattern that, if matched to the request URL path, triggers Hosting to respond with a redirect to the specified destination path.
     * 
     */
    @Import(name="redirects", required=true)
      private final List<RedirectResponse> redirects;

    public List<RedirectResponse> redirects() {
        return this.redirects;
    }

    /**
     * An array of objects (called rewrite rules), where each rule specifies a URL pattern that, if matched to the request URL path, triggers Hosting to respond as if the service were given the specified destination URL.
     * 
     */
    @Import(name="rewrites", required=true)
      private final List<RewriteResponse> rewrites;

    public List<RewriteResponse> rewrites() {
        return this.rewrites;
    }

    /**
     * Defines how to handle a trailing slash in the URL path.
     * 
     */
    @Import(name="trailingSlashBehavior", required=true)
      private final String trailingSlashBehavior;

    public String trailingSlashBehavior() {
        return this.trailingSlashBehavior;
    }

    public ServingConfigResponse(
        String appAssociation,
        Boolean cleanUrls,
        List<HeaderResponse> headers,
        I18nConfigResponse i18n,
        List<RedirectResponse> redirects,
        List<RewriteResponse> rewrites,
        String trailingSlashBehavior) {
        this.appAssociation = Objects.requireNonNull(appAssociation, "expected parameter 'appAssociation' to be non-null");
        this.cleanUrls = Objects.requireNonNull(cleanUrls, "expected parameter 'cleanUrls' to be non-null");
        this.headers = Objects.requireNonNull(headers, "expected parameter 'headers' to be non-null");
        this.i18n = Objects.requireNonNull(i18n, "expected parameter 'i18n' to be non-null");
        this.redirects = Objects.requireNonNull(redirects, "expected parameter 'redirects' to be non-null");
        this.rewrites = Objects.requireNonNull(rewrites, "expected parameter 'rewrites' to be non-null");
        this.trailingSlashBehavior = Objects.requireNonNull(trailingSlashBehavior, "expected parameter 'trailingSlashBehavior' to be non-null");
    }

    private ServingConfigResponse() {
        this.appAssociation = null;
        this.cleanUrls = null;
        this.headers = List.of();
        this.i18n = null;
        this.redirects = List.of();
        this.rewrites = List.of();
        this.trailingSlashBehavior = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appAssociation;
        private Boolean cleanUrls;
        private List<HeaderResponse> headers;
        private I18nConfigResponse i18n;
        private List<RedirectResponse> redirects;
        private List<RewriteResponse> rewrites;
        private String trailingSlashBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(ServingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appAssociation = defaults.appAssociation;
    	      this.cleanUrls = defaults.cleanUrls;
    	      this.headers = defaults.headers;
    	      this.i18n = defaults.i18n;
    	      this.redirects = defaults.redirects;
    	      this.rewrites = defaults.rewrites;
    	      this.trailingSlashBehavior = defaults.trailingSlashBehavior;
        }

        public Builder appAssociation(String appAssociation) {
            this.appAssociation = Objects.requireNonNull(appAssociation);
            return this;
        }
        public Builder cleanUrls(Boolean cleanUrls) {
            this.cleanUrls = Objects.requireNonNull(cleanUrls);
            return this;
        }
        public Builder headers(List<HeaderResponse> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder headers(HeaderResponse... headers) {
            return headers(List.of(headers));
        }
        public Builder i18n(I18nConfigResponse i18n) {
            this.i18n = Objects.requireNonNull(i18n);
            return this;
        }
        public Builder redirects(List<RedirectResponse> redirects) {
            this.redirects = Objects.requireNonNull(redirects);
            return this;
        }
        public Builder redirects(RedirectResponse... redirects) {
            return redirects(List.of(redirects));
        }
        public Builder rewrites(List<RewriteResponse> rewrites) {
            this.rewrites = Objects.requireNonNull(rewrites);
            return this;
        }
        public Builder rewrites(RewriteResponse... rewrites) {
            return rewrites(List.of(rewrites));
        }
        public Builder trailingSlashBehavior(String trailingSlashBehavior) {
            this.trailingSlashBehavior = Objects.requireNonNull(trailingSlashBehavior);
            return this;
        }        public ServingConfigResponse build() {
            return new ServingConfigResponse(appAssociation, cleanUrls, headers, i18n, redirects, rewrites, trailingSlashBehavior);
        }
    }
}
