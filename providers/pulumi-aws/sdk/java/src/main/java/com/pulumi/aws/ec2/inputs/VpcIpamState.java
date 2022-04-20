// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamState extends com.pulumi.resources.ResourceArgs {

    public static final VpcIpamState Empty = new VpcIpamState();

    /**
     * Amazon Resource Name (ARN) of IPAM
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * A description for the IPAM.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the region_name parameter. You **must** set your provider block region as an operating_region.
     * 
     */
    @Import(name="operatingRegions")
      private final @Nullable Output<List<VpcIpamOperatingRegionGetArgs>> operatingRegions;

    public Output<List<VpcIpamOperatingRegionGetArgs>> operatingRegions() {
        return this.operatingRegions == null ? Codegen.empty() : this.operatingRegions;
    }

    /**
     * The ID of the IPAM&#39;s private scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private IP space. The public scope is intended for all internet-routable IP space.
     * 
     */
    @Import(name="privateDefaultScopeId")
      private final @Nullable Output<String> privateDefaultScopeId;

    public Output<String> privateDefaultScopeId() {
        return this.privateDefaultScopeId == null ? Codegen.empty() : this.privateDefaultScopeId;
    }

    /**
     * The ID of the IPAM&#39;s public scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private
     * IP space. The public scope is intended for all internet-routable IP space.
     * 
     */
    @Import(name="publicDefaultScopeId")
      private final @Nullable Output<String> publicDefaultScopeId;

    public Output<String> publicDefaultScopeId() {
        return this.publicDefaultScopeId == null ? Codegen.empty() : this.publicDefaultScopeId;
    }

    /**
     * The number of scopes in the IPAM.
     * 
     */
    @Import(name="scopeCount")
      private final @Nullable Output<Integer> scopeCount;

    public Output<Integer> scopeCount() {
        return this.scopeCount == null ? Codegen.empty() : this.scopeCount;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public VpcIpamState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<List<VpcIpamOperatingRegionGetArgs>> operatingRegions,
        @Nullable Output<String> privateDefaultScopeId,
        @Nullable Output<String> publicDefaultScopeId,
        @Nullable Output<Integer> scopeCount,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.operatingRegions = operatingRegions;
        this.privateDefaultScopeId = privateDefaultScopeId;
        this.publicDefaultScopeId = publicDefaultScopeId;
        this.scopeCount = scopeCount;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private VpcIpamState() {
        this.arn = Codegen.empty();
        this.description = Codegen.empty();
        this.operatingRegions = Codegen.empty();
        this.privateDefaultScopeId = Codegen.empty();
        this.publicDefaultScopeId = Codegen.empty();
        this.scopeCount = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<List<VpcIpamOperatingRegionGetArgs>> operatingRegions;
        private @Nullable Output<String> privateDefaultScopeId;
        private @Nullable Output<String> publicDefaultScopeId;
        private @Nullable Output<Integer> scopeCount;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.operatingRegions = defaults.operatingRegions;
    	      this.privateDefaultScopeId = defaults.privateDefaultScopeId;
    	      this.publicDefaultScopeId = defaults.publicDefaultScopeId;
    	      this.scopeCount = defaults.scopeCount;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder operatingRegions(@Nullable Output<List<VpcIpamOperatingRegionGetArgs>> operatingRegions) {
            this.operatingRegions = operatingRegions;
            return this;
        }
        public Builder operatingRegions(@Nullable List<VpcIpamOperatingRegionGetArgs> operatingRegions) {
            this.operatingRegions = Codegen.ofNullable(operatingRegions);
            return this;
        }
        public Builder operatingRegions(VpcIpamOperatingRegionGetArgs... operatingRegions) {
            return operatingRegions(List.of(operatingRegions));
        }
        public Builder privateDefaultScopeId(@Nullable Output<String> privateDefaultScopeId) {
            this.privateDefaultScopeId = privateDefaultScopeId;
            return this;
        }
        public Builder privateDefaultScopeId(@Nullable String privateDefaultScopeId) {
            this.privateDefaultScopeId = Codegen.ofNullable(privateDefaultScopeId);
            return this;
        }
        public Builder publicDefaultScopeId(@Nullable Output<String> publicDefaultScopeId) {
            this.publicDefaultScopeId = publicDefaultScopeId;
            return this;
        }
        public Builder publicDefaultScopeId(@Nullable String publicDefaultScopeId) {
            this.publicDefaultScopeId = Codegen.ofNullable(publicDefaultScopeId);
            return this;
        }
        public Builder scopeCount(@Nullable Output<Integer> scopeCount) {
            this.scopeCount = scopeCount;
            return this;
        }
        public Builder scopeCount(@Nullable Integer scopeCount) {
            this.scopeCount = Codegen.ofNullable(scopeCount);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public VpcIpamState build() {
            return new VpcIpamState(arn, description, operatingRegions, privateDefaultScopeId, publicDefaultScopeId, scopeCount, tags, tagsAll);
        }
    }
}
