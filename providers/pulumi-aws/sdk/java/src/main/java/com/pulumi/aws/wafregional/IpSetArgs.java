// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.wafregional.inputs.IpSetIpSetDescriptorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpSetArgs Empty = new IpSetArgs();

    /**
     * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) from which web requests originate.
     * 
     */
    @Import(name="ipSetDescriptors")
    private @Nullable Output<List<IpSetIpSetDescriptorArgs>> ipSetDescriptors;

    public Optional<Output<List<IpSetIpSetDescriptorArgs>>> ipSetDescriptors() {
        return Optional.ofNullable(this.ipSetDescriptors);
    }

    /**
     * The name or description of the IPSet.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private IpSetArgs() {}

    private IpSetArgs(IpSetArgs $) {
        this.ipSetDescriptors = $.ipSetDescriptors;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpSetArgs $;

        public Builder() {
            $ = new IpSetArgs();
        }

        public Builder(IpSetArgs defaults) {
            $ = new IpSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipSetDescriptors(@Nullable Output<List<IpSetIpSetDescriptorArgs>> ipSetDescriptors) {
            $.ipSetDescriptors = ipSetDescriptors;
            return this;
        }

        public Builder ipSetDescriptors(List<IpSetIpSetDescriptorArgs> ipSetDescriptors) {
            return ipSetDescriptors(Output.of(ipSetDescriptors));
        }

        public Builder ipSetDescriptors(IpSetIpSetDescriptorArgs... ipSetDescriptors) {
            return ipSetDescriptors(List.of(ipSetDescriptors));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public IpSetArgs build() {
            return $;
        }
    }

}
