// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetGroupArgs Empty = new SubnetGroupArgs();

    /**
     * Description for the cache subnet group. Defaults to "Managed by Pulumi".
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name for the cache subnet group. Elasticache converts this name to lowercase.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * List of VPC Subnet IDs for the cache subnet group
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public SubnetGroupArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description == null ? Codegen.ofNullable("Managed by Pulumi") : description;
        this.name = name;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
    }

    private SubnetGroupArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder subnetIds(Output<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Output.of(Objects.requireNonNull(subnetIds));
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public SubnetGroupArgs build() {
            return new SubnetGroupArgs(description, name, subnetIds, tags);
        }
    }
}
