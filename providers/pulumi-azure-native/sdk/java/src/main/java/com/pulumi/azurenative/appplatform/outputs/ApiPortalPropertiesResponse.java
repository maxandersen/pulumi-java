// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.azurenative.appplatform.outputs.ApiPortalInstanceResponse;
import com.pulumi.azurenative.appplatform.outputs.ApiPortalResourceRequestsResponse;
import com.pulumi.azurenative.appplatform.outputs.SsoPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiPortalPropertiesResponse {
    /**
     * @return The array of resource Ids of gateway to integrate with API portal.
     * 
     */
    private final @Nullable List<String> gatewayIds;
    /**
     * @return Indicate if only https is allowed.
     * 
     */
    private final @Nullable Boolean httpsOnly;
    /**
     * @return Collection of instances belong to API portal.
     * 
     */
    private final List<ApiPortalInstanceResponse> instances;
    /**
     * @return State of the API portal.
     * 
     */
    private final String provisioningState;
    /**
     * @return Indicates whether the API portal exposes endpoint.
     * 
     */
    private final @Nullable Boolean public_;
    /**
     * @return The requested resource quantity for required CPU and Memory.
     * 
     */
    private final ApiPortalResourceRequestsResponse resourceRequests;
    /**
     * @return Collection of OpenAPI source URL locations.
     * 
     */
    private final @Nullable List<String> sourceUrls;
    /**
     * @return Single sign-on related configuration
     * 
     */
    private final @Nullable SsoPropertiesResponse ssoProperties;
    /**
     * @return URL of the API portal, exposed when &#39;public&#39; is true.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private ApiPortalPropertiesResponse(
        @CustomType.Parameter("gatewayIds") @Nullable List<String> gatewayIds,
        @CustomType.Parameter("httpsOnly") @Nullable Boolean httpsOnly,
        @CustomType.Parameter("instances") List<ApiPortalInstanceResponse> instances,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("public") @Nullable Boolean public_,
        @CustomType.Parameter("resourceRequests") ApiPortalResourceRequestsResponse resourceRequests,
        @CustomType.Parameter("sourceUrls") @Nullable List<String> sourceUrls,
        @CustomType.Parameter("ssoProperties") @Nullable SsoPropertiesResponse ssoProperties,
        @CustomType.Parameter("url") String url) {
        this.gatewayIds = gatewayIds;
        this.httpsOnly = httpsOnly;
        this.instances = instances;
        this.provisioningState = provisioningState;
        this.public_ = public_;
        this.resourceRequests = resourceRequests;
        this.sourceUrls = sourceUrls;
        this.ssoProperties = ssoProperties;
        this.url = url;
    }

    /**
     * @return The array of resource Ids of gateway to integrate with API portal.
     * 
     */
    public List<String> gatewayIds() {
        return this.gatewayIds == null ? List.of() : this.gatewayIds;
    }
    /**
     * @return Indicate if only https is allowed.
     * 
     */
    public Optional<Boolean> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }
    /**
     * @return Collection of instances belong to API portal.
     * 
     */
    public List<ApiPortalInstanceResponse> instances() {
        return this.instances;
    }
    /**
     * @return State of the API portal.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Indicates whether the API portal exposes endpoint.
     * 
     */
    public Optional<Boolean> public_() {
        return Optional.ofNullable(this.public_);
    }
    /**
     * @return The requested resource quantity for required CPU and Memory.
     * 
     */
    public ApiPortalResourceRequestsResponse resourceRequests() {
        return this.resourceRequests;
    }
    /**
     * @return Collection of OpenAPI source URL locations.
     * 
     */
    public List<String> sourceUrls() {
        return this.sourceUrls == null ? List.of() : this.sourceUrls;
    }
    /**
     * @return Single sign-on related configuration
     * 
     */
    public Optional<SsoPropertiesResponse> ssoProperties() {
        return Optional.ofNullable(this.ssoProperties);
    }
    /**
     * @return URL of the API portal, exposed when &#39;public&#39; is true.
     * 
     */
    public String url() {
        return this.url;
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
