// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.ApiPortalInstanceResponse;
import io.pulumi.azurenative.appplatform.inputs.ApiPortalResourceRequestsResponse;
import io.pulumi.azurenative.appplatform.inputs.SsoPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API portal properties payload
 * 
 */
public final class ApiPortalPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiPortalPropertiesResponse Empty = new ApiPortalPropertiesResponse();

    /**
     * The array of resource Ids of gateway to integrate with API portal.
     * 
     */
    @Import(name="gatewayIds")
      private final @Nullable List<String> gatewayIds;

    public List<String> gatewayIds() {
        return this.gatewayIds == null ? List.of() : this.gatewayIds;
    }

    /**
     * Indicate if only https is allowed.
     * 
     */
    @Import(name="httpsOnly")
      private final @Nullable Boolean httpsOnly;

    public Optional<Boolean> httpsOnly() {
        return this.httpsOnly == null ? Optional.empty() : Optional.ofNullable(this.httpsOnly);
    }

    /**
     * Collection of instances belong to API portal.
     * 
     */
    @Import(name="instances", required=true)
      private final List<ApiPortalInstanceResponse> instances;

    public List<ApiPortalInstanceResponse> instances() {
        return this.instances;
    }

    /**
     * State of the API portal.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Indicates whether the API portal exposes endpoint.
     * 
     */
    @Import(name="public")
      private final @Nullable Boolean public_;

    public Optional<Boolean> public_() {
        return this.public_ == null ? Optional.empty() : Optional.ofNullable(this.public_);
    }

    /**
     * The requested resource quantity for required CPU and Memory.
     * 
     */
    @Import(name="resourceRequests", required=true)
      private final ApiPortalResourceRequestsResponse resourceRequests;

    public ApiPortalResourceRequestsResponse resourceRequests() {
        return this.resourceRequests;
    }

    /**
     * Collection of OpenAPI source URL locations.
     * 
     */
    @Import(name="sourceUrls")
      private final @Nullable List<String> sourceUrls;

    public List<String> sourceUrls() {
        return this.sourceUrls == null ? List.of() : this.sourceUrls;
    }

    /**
     * Single sign-on related configuration
     * 
     */
    @Import(name="ssoProperties")
      private final @Nullable SsoPropertiesResponse ssoProperties;

    public Optional<SsoPropertiesResponse> ssoProperties() {
        return this.ssoProperties == null ? Optional.empty() : Optional.ofNullable(this.ssoProperties);
    }

    /**
     * URL of the API portal, exposed when 'public' is true.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String url() {
        return this.url;
    }

    public ApiPortalPropertiesResponse(
        @Nullable List<String> gatewayIds,
        @Nullable Boolean httpsOnly,
        List<ApiPortalInstanceResponse> instances,
        String provisioningState,
        @Nullable Boolean public_,
        ApiPortalResourceRequestsResponse resourceRequests,
        @Nullable List<String> sourceUrls,
        @Nullable SsoPropertiesResponse ssoProperties,
        String url) {
        this.gatewayIds = gatewayIds;
        this.httpsOnly = httpsOnly;
        this.instances = Objects.requireNonNull(instances, "expected parameter 'instances' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.public_ = public_;
        this.resourceRequests = Objects.requireNonNull(resourceRequests, "expected parameter 'resourceRequests' to be non-null");
        this.sourceUrls = sourceUrls;
        this.ssoProperties = ssoProperties;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private ApiPortalPropertiesResponse() {
        this.gatewayIds = List.of();
        this.httpsOnly = null;
        this.instances = List.of();
        this.provisioningState = null;
        this.public_ = null;
        this.resourceRequests = null;
        this.sourceUrls = List.of();
        this.ssoProperties = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPortalPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> gatewayIds;
        private @Nullable Boolean httpsOnly;
        private List<ApiPortalInstanceResponse> instances;
        private String provisioningState;
        private @Nullable Boolean public_;
        private ApiPortalResourceRequestsResponse resourceRequests;
        private @Nullable List<String> sourceUrls;
        private @Nullable SsoPropertiesResponse ssoProperties;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPortalPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayIds = defaults.gatewayIds;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.instances = defaults.instances;
    	      this.provisioningState = defaults.provisioningState;
    	      this.public_ = defaults.public_;
    	      this.resourceRequests = defaults.resourceRequests;
    	      this.sourceUrls = defaults.sourceUrls;
    	      this.ssoProperties = defaults.ssoProperties;
    	      this.url = defaults.url;
        }

        public Builder gatewayIds(@Nullable List<String> gatewayIds) {
            this.gatewayIds = gatewayIds;
            return this;
        }
        public Builder gatewayIds(String... gatewayIds) {
            return gatewayIds(List.of(gatewayIds));
        }
        public Builder httpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }
        public Builder instances(List<ApiPortalInstanceResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(ApiPortalInstanceResponse... instances) {
            return instances(List.of(instances));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder public_(@Nullable Boolean public_) {
            this.public_ = public_;
            return this;
        }
        public Builder resourceRequests(ApiPortalResourceRequestsResponse resourceRequests) {
            this.resourceRequests = Objects.requireNonNull(resourceRequests);
            return this;
        }
        public Builder sourceUrls(@Nullable List<String> sourceUrls) {
            this.sourceUrls = sourceUrls;
            return this;
        }
        public Builder sourceUrls(String... sourceUrls) {
            return sourceUrls(List.of(sourceUrls));
        }
        public Builder ssoProperties(@Nullable SsoPropertiesResponse ssoProperties) {
            this.ssoProperties = ssoProperties;
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public ApiPortalPropertiesResponse build() {
            return new ApiPortalPropertiesResponse(gatewayIds, httpsOnly, instances, provisioningState, public_, resourceRequests, sourceUrls, ssoProperties, url);
        }
    }
}
