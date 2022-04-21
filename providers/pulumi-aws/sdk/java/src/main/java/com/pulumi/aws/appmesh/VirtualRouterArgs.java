// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh;

import com.pulumi.aws.appmesh.inputs.VirtualRouterSpecArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualRouterArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualRouterArgs Empty = new VirtualRouterArgs();

    /**
     * The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="meshName", required=true)
    private Output<String> meshName;

    public Output<String> meshName() {
        return this.meshName;
    }

    /**
     * The AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @Import(name="meshOwner")
    private @Nullable Output<String> meshOwner;

    public Optional<Output<String>> meshOwner() {
        return Optional.ofNullable(this.meshOwner);
    }

    /**
     * The name to use for the virtual router. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The virtual router specification to apply.
     * 
     */
    @Import(name="spec", required=true)
    private Output<VirtualRouterSpecArgs> spec;

    public Output<VirtualRouterSpecArgs> spec() {
        return this.spec;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private VirtualRouterArgs() {}

    private VirtualRouterArgs(VirtualRouterArgs $) {
        this.meshName = $.meshName;
        this.meshOwner = $.meshOwner;
        this.name = $.name;
        this.spec = $.spec;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualRouterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualRouterArgs $;

        public Builder() {
            $ = new VirtualRouterArgs();
        }

        public Builder(VirtualRouterArgs defaults) {
            $ = new VirtualRouterArgs(Objects.requireNonNull(defaults));
        }

        public Builder meshName(Output<String> meshName) {
            $.meshName = meshName;
            return this;
        }

        public Builder meshName(String meshName) {
            return meshName(Output.of(meshName));
        }

        public Builder meshOwner(@Nullable Output<String> meshOwner) {
            $.meshOwner = meshOwner;
            return this;
        }

        public Builder meshOwner(String meshOwner) {
            return meshOwner(Output.of(meshOwner));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder spec(Output<VirtualRouterSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        public Builder spec(VirtualRouterSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public VirtualRouterArgs build() {
            $.meshName = Objects.requireNonNull($.meshName, "expected parameter 'meshName' to be non-null");
            $.spec = Objects.requireNonNull($.spec, "expected parameter 'spec' to be non-null");
            return $;
        }
    }

}
