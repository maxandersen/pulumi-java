// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverRuleAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final ResolverRuleAssociationState Empty = new ResolverRuleAssociationState();

    /**
     * A name for the association that you&#39;re creating between a resolver rule and a VPC.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the resolver rule that you want to associate with the VPC.
     * 
     */
    @Import(name="resolverRuleId")
      private final @Nullable Output<String> resolverRuleId;

    public Output<String> resolverRuleId() {
        return this.resolverRuleId == null ? Codegen.empty() : this.resolverRuleId;
    }

    /**
     * The ID of the VPC that you want to associate the resolver rule with.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public ResolverRuleAssociationState(
        @Nullable Output<String> name,
        @Nullable Output<String> resolverRuleId,
        @Nullable Output<String> vpcId) {
        this.name = name;
        this.resolverRuleId = resolverRuleId;
        this.vpcId = vpcId;
    }

    private ResolverRuleAssociationState() {
        this.name = Codegen.empty();
        this.resolverRuleId = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverRuleAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> resolverRuleId;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverRuleAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resolverRuleId = defaults.resolverRuleId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder resolverRuleId(@Nullable Output<String> resolverRuleId) {
            this.resolverRuleId = resolverRuleId;
            return this;
        }
        public Builder resolverRuleId(@Nullable String resolverRuleId) {
            this.resolverRuleId = Codegen.ofNullable(resolverRuleId);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public ResolverRuleAssociationState build() {
            return new ResolverRuleAssociationState(name, resolverRuleId, vpcId);
        }
    }
}
