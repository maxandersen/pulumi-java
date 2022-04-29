// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital.inputs;

import com.pulumi.azurenative.orbital.inputs.EndPointArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contact Profile Link Channel
 * 
 */
public final class ContactProfileLinkChannelArgs extends ResourceArgs {

    public static final ContactProfileLinkChannelArgs Empty = new ContactProfileLinkChannelArgs();

    /**
     * Bandwidth in MHz
     * 
     */
    @Import(name="bandwidthMHz", required=true)
    private Output<Double> bandwidthMHz;

    /**
     * @return Bandwidth in MHz
     * 
     */
    public Output<Double> bandwidthMHz() {
        return this.bandwidthMHz;
    }

    /**
     * Center Frequency in MHz
     * 
     */
    @Import(name="centerFrequencyMHz", required=true)
    private Output<Double> centerFrequencyMHz;

    /**
     * @return Center Frequency in MHz
     * 
     */
    public Output<Double> centerFrequencyMHz() {
        return this.centerFrequencyMHz;
    }

    /**
     * Configuration for decoding
     * 
     */
    @Import(name="decodingConfiguration")
    private @Nullable Output<String> decodingConfiguration;

    /**
     * @return Configuration for decoding
     * 
     */
    public Optional<Output<String>> decodingConfiguration() {
        return Optional.ofNullable(this.decodingConfiguration);
    }

    /**
     * Configuration for demodulation
     * 
     */
    @Import(name="demodulationConfiguration")
    private @Nullable Output<String> demodulationConfiguration;

    /**
     * @return Configuration for demodulation
     * 
     */
    public Optional<Output<String>> demodulationConfiguration() {
        return Optional.ofNullable(this.demodulationConfiguration);
    }

    /**
     * Configuration for encoding
     * 
     */
    @Import(name="encodingConfiguration")
    private @Nullable Output<String> encodingConfiguration;

    /**
     * @return Configuration for encoding
     * 
     */
    public Optional<Output<String>> encodingConfiguration() {
        return Optional.ofNullable(this.encodingConfiguration);
    }

    /**
     * Customer End point to store/retrieve data during a contact.
     * 
     */
    @Import(name="endPoint", required=true)
    private Output<EndPointArgs> endPoint;

    /**
     * @return Customer End point to store/retrieve data during a contact.
     * 
     */
    public Output<EndPointArgs> endPoint() {
        return this.endPoint;
    }

    /**
     * Configuration for modulation
     * 
     */
    @Import(name="modulationConfiguration")
    private @Nullable Output<String> modulationConfiguration;

    /**
     * @return Configuration for modulation
     * 
     */
    public Optional<Output<String>> modulationConfiguration() {
        return Optional.ofNullable(this.modulationConfiguration);
    }

    private ContactProfileLinkChannelArgs() {}

    private ContactProfileLinkChannelArgs(ContactProfileLinkChannelArgs $) {
        this.bandwidthMHz = $.bandwidthMHz;
        this.centerFrequencyMHz = $.centerFrequencyMHz;
        this.decodingConfiguration = $.decodingConfiguration;
        this.demodulationConfiguration = $.demodulationConfiguration;
        this.encodingConfiguration = $.encodingConfiguration;
        this.endPoint = $.endPoint;
        this.modulationConfiguration = $.modulationConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactProfileLinkChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactProfileLinkChannelArgs $;

        public Builder() {
            $ = new ContactProfileLinkChannelArgs();
        }

        public Builder(ContactProfileLinkChannelArgs defaults) {
            $ = new ContactProfileLinkChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthMHz Bandwidth in MHz
         * 
         * @return builder
         * 
         */
        public Builder bandwidthMHz(Output<Double> bandwidthMHz) {
            $.bandwidthMHz = bandwidthMHz;
            return this;
        }

        /**
         * @param bandwidthMHz Bandwidth in MHz
         * 
         * @return builder
         * 
         */
        public Builder bandwidthMHz(Double bandwidthMHz) {
            return bandwidthMHz(Output.of(bandwidthMHz));
        }

        /**
         * @param centerFrequencyMHz Center Frequency in MHz
         * 
         * @return builder
         * 
         */
        public Builder centerFrequencyMHz(Output<Double> centerFrequencyMHz) {
            $.centerFrequencyMHz = centerFrequencyMHz;
            return this;
        }

        /**
         * @param centerFrequencyMHz Center Frequency in MHz
         * 
         * @return builder
         * 
         */
        public Builder centerFrequencyMHz(Double centerFrequencyMHz) {
            return centerFrequencyMHz(Output.of(centerFrequencyMHz));
        }

        /**
         * @param decodingConfiguration Configuration for decoding
         * 
         * @return builder
         * 
         */
        public Builder decodingConfiguration(@Nullable Output<String> decodingConfiguration) {
            $.decodingConfiguration = decodingConfiguration;
            return this;
        }

        /**
         * @param decodingConfiguration Configuration for decoding
         * 
         * @return builder
         * 
         */
        public Builder decodingConfiguration(String decodingConfiguration) {
            return decodingConfiguration(Output.of(decodingConfiguration));
        }

        /**
         * @param demodulationConfiguration Configuration for demodulation
         * 
         * @return builder
         * 
         */
        public Builder demodulationConfiguration(@Nullable Output<String> demodulationConfiguration) {
            $.demodulationConfiguration = demodulationConfiguration;
            return this;
        }

        /**
         * @param demodulationConfiguration Configuration for demodulation
         * 
         * @return builder
         * 
         */
        public Builder demodulationConfiguration(String demodulationConfiguration) {
            return demodulationConfiguration(Output.of(demodulationConfiguration));
        }

        /**
         * @param encodingConfiguration Configuration for encoding
         * 
         * @return builder
         * 
         */
        public Builder encodingConfiguration(@Nullable Output<String> encodingConfiguration) {
            $.encodingConfiguration = encodingConfiguration;
            return this;
        }

        /**
         * @param encodingConfiguration Configuration for encoding
         * 
         * @return builder
         * 
         */
        public Builder encodingConfiguration(String encodingConfiguration) {
            return encodingConfiguration(Output.of(encodingConfiguration));
        }

        /**
         * @param endPoint Customer End point to store/retrieve data during a contact.
         * 
         * @return builder
         * 
         */
        public Builder endPoint(Output<EndPointArgs> endPoint) {
            $.endPoint = endPoint;
            return this;
        }

        /**
         * @param endPoint Customer End point to store/retrieve data during a contact.
         * 
         * @return builder
         * 
         */
        public Builder endPoint(EndPointArgs endPoint) {
            return endPoint(Output.of(endPoint));
        }

        /**
         * @param modulationConfiguration Configuration for modulation
         * 
         * @return builder
         * 
         */
        public Builder modulationConfiguration(@Nullable Output<String> modulationConfiguration) {
            $.modulationConfiguration = modulationConfiguration;
            return this;
        }

        /**
         * @param modulationConfiguration Configuration for modulation
         * 
         * @return builder
         * 
         */
        public Builder modulationConfiguration(String modulationConfiguration) {
            return modulationConfiguration(Output.of(modulationConfiguration));
        }

        public ContactProfileLinkChannelArgs build() {
            $.bandwidthMHz = Objects.requireNonNull($.bandwidthMHz, "expected parameter 'bandwidthMHz' to be non-null");
            $.centerFrequencyMHz = Objects.requireNonNull($.centerFrequencyMHz, "expected parameter 'centerFrequencyMHz' to be non-null");
            $.endPoint = Objects.requireNonNull($.endPoint, "expected parameter 'endPoint' to be non-null");
            return $;
        }
    }

}
