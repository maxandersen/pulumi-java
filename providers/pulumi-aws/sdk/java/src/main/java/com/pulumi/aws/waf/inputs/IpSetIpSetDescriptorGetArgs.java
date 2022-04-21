// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IpSetIpSetDescriptorGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpSetIpSetDescriptorGetArgs Empty = new IpSetIpSetDescriptorGetArgs();

    /**
     * Type of the IP address - `IPV4` or `IPV6`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * An IPv4 or IPv6 address specified via CIDR notationE.g., `192.0.2.44/32` or `1111:0000:0000:0000:0000:0000:0000:0000/64`
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private IpSetIpSetDescriptorGetArgs() {}

    private IpSetIpSetDescriptorGetArgs(IpSetIpSetDescriptorGetArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpSetIpSetDescriptorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpSetIpSetDescriptorGetArgs $;

        public Builder() {
            $ = new IpSetIpSetDescriptorGetArgs();
        }

        public Builder(IpSetIpSetDescriptorGetArgs defaults) {
            $ = new IpSetIpSetDescriptorGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public IpSetIpSetDescriptorGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
