// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.aws.waf.inputs.IpSetIpSetDescriptorGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IpSetState extends com.pulumi.resources.ResourceArgs {

    public static final IpSetState Empty = new IpSetState();

    /**
     * The ARN of the WAF IPSet.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
     * 
     */
    @Import(name="ipSetDescriptors")
      private final @Nullable Output<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors;

    public Output<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors() {
        return this.ipSetDescriptors == null ? Codegen.empty() : this.ipSetDescriptors;
    }

    /**
     * The name or description of the IPSet.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public IpSetState(
        @Nullable Output<String> arn,
        @Nullable Output<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors,
        @Nullable Output<String> name) {
        this.arn = arn;
        this.ipSetDescriptors = ipSetDescriptors;
        this.name = name;
    }

    private IpSetState() {
        this.arn = Codegen.empty();
        this.ipSetDescriptors = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.ipSetDescriptors = defaults.ipSetDescriptors;
    	      this.name = defaults.name;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder ipSetDescriptors(@Nullable Output<List<IpSetIpSetDescriptorGetArgs>> ipSetDescriptors) {
            this.ipSetDescriptors = ipSetDescriptors;
            return this;
        }
        public Builder ipSetDescriptors(@Nullable List<IpSetIpSetDescriptorGetArgs> ipSetDescriptors) {
            this.ipSetDescriptors = Codegen.ofNullable(ipSetDescriptors);
            return this;
        }
        public Builder ipSetDescriptors(IpSetIpSetDescriptorGetArgs... ipSetDescriptors) {
            return ipSetDescriptors(List.of(ipSetDescriptors));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public IpSetState build() {
            return new IpSetState(arn, ipSetDescriptors, name);
        }
    }
}
