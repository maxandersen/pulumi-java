// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.azurenative.botservice.inputs.LineRegistrationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;


/**
 * The parameters to provide for the Line channel.
 * 
 */
public final class LineChannelPropertiesArgs extends ResourceArgs {

    public static final LineChannelPropertiesArgs Empty = new LineChannelPropertiesArgs();

    /**
     * The list of line channel registrations
     * 
     */
    @Import(name="lineRegistrations", required=true)
    private Output<List<LineRegistrationArgs>> lineRegistrations;

    /**
     * @return The list of line channel registrations
     * 
     */
    public Output<List<LineRegistrationArgs>> lineRegistrations() {
        return this.lineRegistrations;
    }

    private LineChannelPropertiesArgs() {}

    private LineChannelPropertiesArgs(LineChannelPropertiesArgs $) {
        this.lineRegistrations = $.lineRegistrations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LineChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LineChannelPropertiesArgs $;

        public Builder() {
            $ = new LineChannelPropertiesArgs();
        }

        public Builder(LineChannelPropertiesArgs defaults) {
            $ = new LineChannelPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lineRegistrations The list of line channel registrations
         * 
         * @return builder
         * 
         */
        public Builder lineRegistrations(Output<List<LineRegistrationArgs>> lineRegistrations) {
            $.lineRegistrations = lineRegistrations;
            return this;
        }

        /**
         * @param lineRegistrations The list of line channel registrations
         * 
         * @return builder
         * 
         */
        public Builder lineRegistrations(List<LineRegistrationArgs> lineRegistrations) {
            return lineRegistrations(Output.of(lineRegistrations));
        }

        /**
         * @param lineRegistrations The list of line channel registrations
         * 
         * @return builder
         * 
         */
        public Builder lineRegistrations(LineRegistrationArgs... lineRegistrations) {
            return lineRegistrations(List.of(lineRegistrations));
        }

        public LineChannelPropertiesArgs build() {
            $.lineRegistrations = Objects.requireNonNull($.lineRegistrations, "expected parameter 'lineRegistrations' to be non-null");
            return $;
        }
    }

}
