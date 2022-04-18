// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.GetBackendBucketCdnPolicyNegativeCachingPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetBackendBucketCdnPolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetBackendBucketCdnPolicy Empty = new GetBackendBucketCdnPolicy();

    @Import(name="cacheMode", required=true)
      private final String cacheMode;

    public String cacheMode() {
        return this.cacheMode;
    }

    @Import(name="clientTtl", required=true)
      private final Integer clientTtl;

    public Integer clientTtl() {
        return this.clientTtl;
    }

    @Import(name="defaultTtl", required=true)
      private final Integer defaultTtl;

    public Integer defaultTtl() {
        return this.defaultTtl;
    }

    @Import(name="maxTtl", required=true)
      private final Integer maxTtl;

    public Integer maxTtl() {
        return this.maxTtl;
    }

    @Import(name="negativeCaching", required=true)
      private final Boolean negativeCaching;

    public Boolean negativeCaching() {
        return this.negativeCaching;
    }

    @Import(name="negativeCachingPolicies", required=true)
      private final List<GetBackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies;

    public List<GetBackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies() {
        return this.negativeCachingPolicies;
    }

    @Import(name="serveWhileStale", required=true)
      private final Integer serveWhileStale;

    public Integer serveWhileStale() {
        return this.serveWhileStale;
    }

    @Import(name="signedUrlCacheMaxAgeSec", required=true)
      private final Integer signedUrlCacheMaxAgeSec;

    public Integer signedUrlCacheMaxAgeSec() {
        return this.signedUrlCacheMaxAgeSec;
    }

    public GetBackendBucketCdnPolicy(
        String cacheMode,
        Integer clientTtl,
        Integer defaultTtl,
        Integer maxTtl,
        Boolean negativeCaching,
        List<GetBackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies,
        Integer serveWhileStale,
        Integer signedUrlCacheMaxAgeSec) {
        this.cacheMode = Objects.requireNonNull(cacheMode, "expected parameter 'cacheMode' to be non-null");
        this.clientTtl = Objects.requireNonNull(clientTtl, "expected parameter 'clientTtl' to be non-null");
        this.defaultTtl = Objects.requireNonNull(defaultTtl, "expected parameter 'defaultTtl' to be non-null");
        this.maxTtl = Objects.requireNonNull(maxTtl, "expected parameter 'maxTtl' to be non-null");
        this.negativeCaching = Objects.requireNonNull(negativeCaching, "expected parameter 'negativeCaching' to be non-null");
        this.negativeCachingPolicies = Objects.requireNonNull(negativeCachingPolicies, "expected parameter 'negativeCachingPolicies' to be non-null");
        this.serveWhileStale = Objects.requireNonNull(serveWhileStale, "expected parameter 'serveWhileStale' to be non-null");
        this.signedUrlCacheMaxAgeSec = Objects.requireNonNull(signedUrlCacheMaxAgeSec, "expected parameter 'signedUrlCacheMaxAgeSec' to be non-null");
    }

    private GetBackendBucketCdnPolicy() {
        this.cacheMode = null;
        this.clientTtl = null;
        this.defaultTtl = null;
        this.maxTtl = null;
        this.negativeCaching = null;
        this.negativeCachingPolicies = List.of();
        this.serveWhileStale = null;
        this.signedUrlCacheMaxAgeSec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendBucketCdnPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cacheMode;
        private Integer clientTtl;
        private Integer defaultTtl;
        private Integer maxTtl;
        private Boolean negativeCaching;
        private List<GetBackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies;
        private Integer serveWhileStale;
        private Integer signedUrlCacheMaxAgeSec;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendBucketCdnPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicies = defaults.negativeCachingPolicies;
    	      this.serveWhileStale = defaults.serveWhileStale;
    	      this.signedUrlCacheMaxAgeSec = defaults.signedUrlCacheMaxAgeSec;
        }

        public Builder cacheMode(String cacheMode) {
            this.cacheMode = Objects.requireNonNull(cacheMode);
            return this;
        }
        public Builder clientTtl(Integer clientTtl) {
            this.clientTtl = Objects.requireNonNull(clientTtl);
            return this;
        }
        public Builder defaultTtl(Integer defaultTtl) {
            this.defaultTtl = Objects.requireNonNull(defaultTtl);
            return this;
        }
        public Builder maxTtl(Integer maxTtl) {
            this.maxTtl = Objects.requireNonNull(maxTtl);
            return this;
        }
        public Builder negativeCaching(Boolean negativeCaching) {
            this.negativeCaching = Objects.requireNonNull(negativeCaching);
            return this;
        }
        public Builder negativeCachingPolicies(List<GetBackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies) {
            this.negativeCachingPolicies = Objects.requireNonNull(negativeCachingPolicies);
            return this;
        }
        public Builder negativeCachingPolicies(GetBackendBucketCdnPolicyNegativeCachingPolicy... negativeCachingPolicies) {
            return negativeCachingPolicies(List.of(negativeCachingPolicies));
        }
        public Builder serveWhileStale(Integer serveWhileStale) {
            this.serveWhileStale = Objects.requireNonNull(serveWhileStale);
            return this;
        }
        public Builder signedUrlCacheMaxAgeSec(Integer signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = Objects.requireNonNull(signedUrlCacheMaxAgeSec);
            return this;
        }        public GetBackendBucketCdnPolicy build() {
            return new GetBackendBucketCdnPolicy(cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicies, serveWhileStale, signedUrlCacheMaxAgeSec);
        }
    }
}
