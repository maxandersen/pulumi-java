// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream_v1.inputs.GcsDestinationConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration of the stream destination.
 * 
 */
public final class DestinationConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final DestinationConfigResponse Empty = new DestinationConfigResponse();

    /**
     * Destination connection profile resource. Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
     * 
     */
    @Import(name="destinationConnectionProfile", required=true)
    private String destinationConnectionProfile;

    public String destinationConnectionProfile() {
        return this.destinationConnectionProfile;
    }

    /**
     * A configuration for how data should be loaded to Cloud Storage.
     * 
     */
    @Import(name="gcsDestinationConfig", required=true)
    private GcsDestinationConfigResponse gcsDestinationConfig;

    public GcsDestinationConfigResponse gcsDestinationConfig() {
        return this.gcsDestinationConfig;
    }

    private DestinationConfigResponse() {}

    private DestinationConfigResponse(DestinationConfigResponse $) {
        this.destinationConnectionProfile = $.destinationConnectionProfile;
        this.gcsDestinationConfig = $.gcsDestinationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DestinationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DestinationConfigResponse $;

        public Builder() {
            $ = new DestinationConfigResponse();
        }

        public Builder(DestinationConfigResponse defaults) {
            $ = new DestinationConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder destinationConnectionProfile(String destinationConnectionProfile) {
            $.destinationConnectionProfile = destinationConnectionProfile;
            return this;
        }

        public Builder gcsDestinationConfig(GcsDestinationConfigResponse gcsDestinationConfig) {
            $.gcsDestinationConfig = gcsDestinationConfig;
            return this;
        }

        public DestinationConfigResponse build() {
            $.destinationConnectionProfile = Objects.requireNonNull($.destinationConnectionProfile, "expected parameter 'destinationConnectionProfile' to be non-null");
            $.gcsDestinationConfig = Objects.requireNonNull($.gcsDestinationConfig, "expected parameter 'gcsDestinationConfig' to be non-null");
            return $;
        }
    }

}
