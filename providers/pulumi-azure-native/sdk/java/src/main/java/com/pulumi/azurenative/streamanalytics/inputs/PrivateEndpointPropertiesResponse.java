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
    private String createdDate;

    public String createdDate() {
        return this.createdDate;
    }

    /**
     * A list of connections to the remote resource. Immutable after it is set.
     * 
     */
    @Import(name="manualPrivateLinkServiceConnections")
    private @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;

    public Optional<List<PrivateLinkServiceConnectionResponse>> manualPrivateLinkServiceConnections() {
        return Optional.ofNullable(this.manualPrivateLinkServiceConnections);
    }

    private PrivateEndpointPropertiesResponse() {}

    private PrivateEndpointPropertiesResponse(PrivateEndpointPropertiesResponse $) {
        this.createdDate = $.createdDate;
        this.manualPrivateLinkServiceConnections = $.manualPrivateLinkServiceConnections;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointPropertiesResponse $;

        public Builder() {
            $ = new PrivateEndpointPropertiesResponse();
        }

        public Builder(PrivateEndpointPropertiesResponse defaults) {
            $ = new PrivateEndpointPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder createdDate(String createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        public Builder manualPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections) {
            $.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }

        public Builder manualPrivateLinkServiceConnections(PrivateLinkServiceConnectionResponse... manualPrivateLinkServiceConnections) {
            return manualPrivateLinkServiceConnections(List.of(manualPrivateLinkServiceConnections));
        }

        public PrivateEndpointPropertiesResponse build() {
            $.createdDate = Objects.requireNonNull($.createdDate, "expected parameter 'createdDate' to be non-null");
            return $;
        }
    }

}
