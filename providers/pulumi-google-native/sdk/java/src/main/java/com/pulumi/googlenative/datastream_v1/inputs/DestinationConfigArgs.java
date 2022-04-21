// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream_v1.inputs.GcsDestinationConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of the stream destination.
 * 
 */
public final class DestinationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DestinationConfigArgs Empty = new DestinationConfigArgs();

    /**
     * Destination connection profile resource. Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
     * 
     */
    @Import(name="destinationConnectionProfile", required=true)
    private Output<String> destinationConnectionProfile;

    public Output<String> destinationConnectionProfile() {
        return this.destinationConnectionProfile;
    }

    /**
     * A configuration for how data should be loaded to Cloud Storage.
     * 
     */
    @Import(name="gcsDestinationConfig")
    private @Nullable Output<GcsDestinationConfigArgs> gcsDestinationConfig;

    public Optional<Output<GcsDestinationConfigArgs>> gcsDestinationConfig() {
        return Optional.ofNullable(this.gcsDestinationConfig);
    }

    private DestinationConfigArgs() {}

    private DestinationConfigArgs(DestinationConfigArgs $) {
        this.destinationConnectionProfile = $.destinationConnectionProfile;
        this.gcsDestinationConfig = $.gcsDestinationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DestinationConfigArgs $;

        public Builder() {
            $ = new DestinationConfigArgs();
        }

        public Builder(DestinationConfigArgs defaults) {
            $ = new DestinationConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationConnectionProfile(Output<String> destinationConnectionProfile) {
            $.destinationConnectionProfile = destinationConnectionProfile;
            return this;
        }

        public Builder destinationConnectionProfile(String destinationConnectionProfile) {
            return destinationConnectionProfile(Output.of(destinationConnectionProfile));
        }

        public Builder gcsDestinationConfig(@Nullable Output<GcsDestinationConfigArgs> gcsDestinationConfig) {
            $.gcsDestinationConfig = gcsDestinationConfig;
            return this;
        }

        public Builder gcsDestinationConfig(GcsDestinationConfigArgs gcsDestinationConfig) {
            return gcsDestinationConfig(Output.of(gcsDestinationConfig));
        }

        public DestinationConfigArgs build() {
            $.destinationConnectionProfile = Objects.requireNonNull($.destinationConnectionProfile, "expected parameter 'destinationConnectionProfile' to be non-null");
            return $;
        }
    }

}
