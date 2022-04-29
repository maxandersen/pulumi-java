// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An traffic selector policy for a virtual network gateway connection.
 * 
 */
public final class TrafficSelectorPolicyArgs extends ResourceArgs {

    public static final TrafficSelectorPolicyArgs Empty = new TrafficSelectorPolicyArgs();

    /**
     * A collection of local address spaces in CIDR format.
     * 
     */
    @Import(name="localAddressRanges", required=true)
    private Output<List<String>> localAddressRanges;

    /**
     * @return A collection of local address spaces in CIDR format.
     * 
     */
    public Output<List<String>> localAddressRanges() {
        return this.localAddressRanges;
    }

    /**
     * A collection of remote address spaces in CIDR format.
     * 
     */
    @Import(name="remoteAddressRanges", required=true)
    private Output<List<String>> remoteAddressRanges;

    /**
     * @return A collection of remote address spaces in CIDR format.
     * 
     */
    public Output<List<String>> remoteAddressRanges() {
        return this.remoteAddressRanges;
    }

    private TrafficSelectorPolicyArgs() {}

    private TrafficSelectorPolicyArgs(TrafficSelectorPolicyArgs $) {
        this.localAddressRanges = $.localAddressRanges;
        this.remoteAddressRanges = $.remoteAddressRanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficSelectorPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficSelectorPolicyArgs $;

        public Builder() {
            $ = new TrafficSelectorPolicyArgs();
        }

        public Builder(TrafficSelectorPolicyArgs defaults) {
            $ = new TrafficSelectorPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localAddressRanges A collection of local address spaces in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder localAddressRanges(Output<List<String>> localAddressRanges) {
            $.localAddressRanges = localAddressRanges;
            return this;
        }

        /**
         * @param localAddressRanges A collection of local address spaces in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder localAddressRanges(List<String> localAddressRanges) {
            return localAddressRanges(Output.of(localAddressRanges));
        }

        /**
         * @param localAddressRanges A collection of local address spaces in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder localAddressRanges(String... localAddressRanges) {
            return localAddressRanges(List.of(localAddressRanges));
        }

        /**
         * @param remoteAddressRanges A collection of remote address spaces in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder remoteAddressRanges(Output<List<String>> remoteAddressRanges) {
            $.remoteAddressRanges = remoteAddressRanges;
            return this;
        }

        /**
         * @param remoteAddressRanges A collection of remote address spaces in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder remoteAddressRanges(List<String> remoteAddressRanges) {
            return remoteAddressRanges(Output.of(remoteAddressRanges));
        }

        /**
         * @param remoteAddressRanges A collection of remote address spaces in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder remoteAddressRanges(String... remoteAddressRanges) {
            return remoteAddressRanges(List.of(remoteAddressRanges));
        }

        public TrafficSelectorPolicyArgs build() {
            $.localAddressRanges = Objects.requireNonNull($.localAddressRanges, "expected parameter 'localAddressRanges' to be non-null");
            $.remoteAddressRanges = Objects.requireNonNull($.remoteAddressRanges, "expected parameter 'remoteAddressRanges' to be non-null");
            return $;
        }
    }

}
