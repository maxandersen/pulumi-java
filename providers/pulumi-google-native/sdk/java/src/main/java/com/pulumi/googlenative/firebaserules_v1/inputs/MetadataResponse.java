// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Metadata for a Ruleset.
 * 
 */
public final class MetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetadataResponse Empty = new MetadataResponse();

    /**
     * Services that this ruleset has declarations for (e.g., &#34;cloud.firestore&#34;). There may be 0+ of these.
     * 
     */
    @Import(name="services", required=true)
      private final List<String> services;

    public List<String> services() {
        return this.services;
    }

    public MetadataResponse(List<String> services) {
        this.services = Objects.requireNonNull(services, "expected parameter 'services' to be non-null");
    }

    private MetadataResponse() {
        this.services = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> services;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.services = defaults.services;
        }

        public Builder services(List<String> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }        public MetadataResponse build() {
            return new MetadataResponse(services);
        }
    }
}
