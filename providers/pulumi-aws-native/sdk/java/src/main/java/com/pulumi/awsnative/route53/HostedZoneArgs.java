// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53;

import com.pulumi.awsnative.route53.inputs.HostedZoneConfigArgs;
import com.pulumi.awsnative.route53.inputs.HostedZoneQueryLoggingConfigArgs;
import com.pulumi.awsnative.route53.inputs.HostedZoneTagArgs;
import com.pulumi.awsnative.route53.inputs.HostedZoneVPCArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedZoneArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostedZoneArgs Empty = new HostedZoneArgs();

    @Import(name="hostedZoneConfig")
      private final @Nullable Output<HostedZoneConfigArgs> hostedZoneConfig;

    public Output<HostedZoneConfigArgs> hostedZoneConfig() {
        return this.hostedZoneConfig == null ? Codegen.empty() : this.hostedZoneConfig;
    }

    /**
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * 
     * For information about using tags for cost allocation, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
     * 
     */
    @Import(name="hostedZoneTags")
      private final @Nullable Output<List<HostedZoneTagArgs>> hostedZoneTags;

    public Output<List<HostedZoneTagArgs>> hostedZoneTags() {
        return this.hostedZoneTags == null ? Codegen.empty() : this.hostedZoneTags;
    }

    /**
     * The name of the domain. Specify a fully qualified domain name, for example, www.example.com. The trailing dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route 53 treats www.example.com (without a trailing dot) and www.example.com. (with a trailing dot) as identical.
     * 
     * If you&#39;re creating a public hosted zone, this is the name you have registered with your DNS registrar. If your domain name is registered with a registrar other than Route 53, change the name servers for your domain to the set of NameServers that are returned by the Fn::GetAtt intrinsic function.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="queryLoggingConfig")
      private final @Nullable Output<HostedZoneQueryLoggingConfigArgs> queryLoggingConfig;

    public Output<HostedZoneQueryLoggingConfigArgs> queryLoggingConfig() {
        return this.queryLoggingConfig == null ? Codegen.empty() : this.queryLoggingConfig;
    }

    /**
     * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
     * 
     */
    @Import(name="vPCs")
      private final @Nullable Output<List<HostedZoneVPCArgs>> vPCs;

    public Output<List<HostedZoneVPCArgs>> vPCs() {
        return this.vPCs == null ? Codegen.empty() : this.vPCs;
    }

    public HostedZoneArgs(
        @Nullable Output<HostedZoneConfigArgs> hostedZoneConfig,
        @Nullable Output<List<HostedZoneTagArgs>> hostedZoneTags,
        @Nullable Output<String> name,
        @Nullable Output<HostedZoneQueryLoggingConfigArgs> queryLoggingConfig,
        @Nullable Output<List<HostedZoneVPCArgs>> vPCs) {
        this.hostedZoneConfig = hostedZoneConfig;
        this.hostedZoneTags = hostedZoneTags;
        this.name = name;
        this.queryLoggingConfig = queryLoggingConfig;
        this.vPCs = vPCs;
    }

    private HostedZoneArgs() {
        this.hostedZoneConfig = Codegen.empty();
        this.hostedZoneTags = Codegen.empty();
        this.name = Codegen.empty();
        this.queryLoggingConfig = Codegen.empty();
        this.vPCs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HostedZoneConfigArgs> hostedZoneConfig;
        private @Nullable Output<List<HostedZoneTagArgs>> hostedZoneTags;
        private @Nullable Output<String> name;
        private @Nullable Output<HostedZoneQueryLoggingConfigArgs> queryLoggingConfig;
        private @Nullable Output<List<HostedZoneVPCArgs>> vPCs;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostedZoneConfig = defaults.hostedZoneConfig;
    	      this.hostedZoneTags = defaults.hostedZoneTags;
    	      this.name = defaults.name;
    	      this.queryLoggingConfig = defaults.queryLoggingConfig;
    	      this.vPCs = defaults.vPCs;
        }

        public Builder hostedZoneConfig(@Nullable Output<HostedZoneConfigArgs> hostedZoneConfig) {
            this.hostedZoneConfig = hostedZoneConfig;
            return this;
        }
        public Builder hostedZoneConfig(@Nullable HostedZoneConfigArgs hostedZoneConfig) {
            this.hostedZoneConfig = Codegen.ofNullable(hostedZoneConfig);
            return this;
        }
        public Builder hostedZoneTags(@Nullable Output<List<HostedZoneTagArgs>> hostedZoneTags) {
            this.hostedZoneTags = hostedZoneTags;
            return this;
        }
        public Builder hostedZoneTags(@Nullable List<HostedZoneTagArgs> hostedZoneTags) {
            this.hostedZoneTags = Codegen.ofNullable(hostedZoneTags);
            return this;
        }
        public Builder hostedZoneTags(HostedZoneTagArgs... hostedZoneTags) {
            return hostedZoneTags(List.of(hostedZoneTags));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder queryLoggingConfig(@Nullable Output<HostedZoneQueryLoggingConfigArgs> queryLoggingConfig) {
            this.queryLoggingConfig = queryLoggingConfig;
            return this;
        }
        public Builder queryLoggingConfig(@Nullable HostedZoneQueryLoggingConfigArgs queryLoggingConfig) {
            this.queryLoggingConfig = Codegen.ofNullable(queryLoggingConfig);
            return this;
        }
        public Builder vPCs(@Nullable Output<List<HostedZoneVPCArgs>> vPCs) {
            this.vPCs = vPCs;
            return this;
        }
        public Builder vPCs(@Nullable List<HostedZoneVPCArgs> vPCs) {
            this.vPCs = Codegen.ofNullable(vPCs);
            return this;
        }
        public Builder vPCs(HostedZoneVPCArgs... vPCs) {
            return vPCs(List.of(vPCs));
        }        public HostedZoneArgs build() {
            return new HostedZoneArgs(hostedZoneConfig, hostedZoneTags, name, queryLoggingConfig, vPCs);
        }
    }
}
