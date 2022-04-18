// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.PrivateLinkServiceConnectionResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties associated with a private endpoint.
 * 
 */
public final class PrivateEndpointPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointPropertiesResponse Empty = new PrivateEndpointPropertiesResponse();

    /**
     * The date when this private endpoint was created.
     * 
     */
    @Import(name="createdDate", required=true)
      private final String createdDate;

    public String createdDate() {
        return this.createdDate;
    }

    /**
     * A list of connections to the remote resource. Immutable after it is set.
     * 
     */
    @Import(name="manualPrivateLinkServiceConnections")
      private final @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;

    public List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections == null ? List.of() : this.manualPrivateLinkServiceConnections;
    }

    public PrivateEndpointPropertiesResponse(
        String createdDate,
        @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections) {
        this.createdDate = Objects.requireNonNull(createdDate, "expected parameter 'createdDate' to be non-null");
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
    }

    private PrivateEndpointPropertiesResponse() {
        this.createdDate = null;
        this.manualPrivateLinkServiceConnections = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.manualPrivateLinkServiceConnections = defaults.manualPrivateLinkServiceConnections;
        }

        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder manualPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }
        public Builder manualPrivateLinkServiceConnections(PrivateLinkServiceConnectionResponse... manualPrivateLinkServiceConnections) {
            return manualPrivateLinkServiceConnections(List.of(manualPrivateLinkServiceConnections));
        }        public PrivateEndpointPropertiesResponse build() {
            return new PrivateEndpointPropertiesResponse(createdDate, manualPrivateLinkServiceConnections);
        }
    }
}
