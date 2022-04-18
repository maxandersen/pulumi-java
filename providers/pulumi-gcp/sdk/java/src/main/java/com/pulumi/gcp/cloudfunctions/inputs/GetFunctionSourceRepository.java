// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionSourceRepository extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionSourceRepository Empty = new GetFunctionSourceRepository();

    @Import(name="deployedUrl", required=true)
      private final String deployedUrl;

    public String deployedUrl() {
        return this.deployedUrl;
    }

    /**
     * The URL pointing to the hosted repository where the function is defined.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String url() {
        return this.url;
    }

    public GetFunctionSourceRepository(
        String deployedUrl,
        String url) {
        this.deployedUrl = Objects.requireNonNull(deployedUrl, "expected parameter 'deployedUrl' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private GetFunctionSourceRepository() {
        this.deployedUrl = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionSourceRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deployedUrl;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionSourceRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployedUrl = defaults.deployedUrl;
    	      this.url = defaults.url;
        }

        public Builder deployedUrl(String deployedUrl) {
            this.deployedUrl = Objects.requireNonNull(deployedUrl);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetFunctionSourceRepository build() {
            return new GetFunctionSourceRepository(deployedUrl, url);
        }
    }
}
