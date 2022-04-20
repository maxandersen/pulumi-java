// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.eventarc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerDestinationCloudRunService {
    /**
     * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: &#34;/route&#34;, &#34;route&#34;, &#34;route/subroute&#34;.
     * 
     */
    private final @Nullable String path;
    /**
     * Required. The region the Cloud Run service is deployed in.
     * 
     */
    private final @Nullable String region;
    /**
     * Required. The name of the Cloud Run service being addressed. See https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services. Only services located in the same project of the trigger object can be addressed.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private TriggerDestinationCloudRunService(
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("service") String service) {
        this.path = path;
        this.region = region;
        this.service = service;
    }

    /**
     * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: &#34;/route&#34;, &#34;route&#34;, &#34;route/subroute&#34;.
     * 
    */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Required. The region the Cloud Run service is deployed in.
     * 
    */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * Required. The name of the Cloud Run service being addressed. See https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services. Only services located in the same project of the trigger object can be addressed.
     * 
    */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDestinationCloudRunService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String path;
        private @Nullable String region;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDestinationCloudRunService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.region = defaults.region;
    	      this.service = defaults.service;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public TriggerDestinationCloudRunService build() {
            return new TriggerDestinationCloudRunService(path, region, service);
        }
    }
}
