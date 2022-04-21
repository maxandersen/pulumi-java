// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.MethodMapArgs;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.OptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CollectionOverride allows resource handling overrides for specific resources within a BaseType
 * 
 */
public final class CollectionOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final CollectionOverrideArgs Empty = new CollectionOverrideArgs();

    /**
     * The collection that identifies this resource within its service.
     * 
     */
    @Import(name="collection")
    private @Nullable Output<String> collection;

    public Optional<Output<String>> collection() {
        return Optional.ofNullable(this.collection);
    }

    /**
     * Custom verb method mappings to support unordered list API mappings.
     * 
     */
    @Import(name="methodMap")
    private @Nullable Output<MethodMapArgs> methodMap;

    public Optional<Output<MethodMapArgs>> methodMap() {
        return Optional.ofNullable(this.methodMap);
    }

    /**
     * The options to apply to this resource-level override
     * 
     */
    @Import(name="options")
    private @Nullable Output<OptionsArgs> options;

    public Optional<Output<OptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    private CollectionOverrideArgs() {}

    private CollectionOverrideArgs(CollectionOverrideArgs $) {
        this.collection = $.collection;
        this.methodMap = $.methodMap;
        this.options = $.options;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CollectionOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CollectionOverrideArgs $;

        public Builder() {
            $ = new CollectionOverrideArgs();
        }

        public Builder(CollectionOverrideArgs defaults) {
            $ = new CollectionOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder collection(@Nullable Output<String> collection) {
            $.collection = collection;
            return this;
        }

        public Builder collection(String collection) {
            return collection(Output.of(collection));
        }

        public Builder methodMap(@Nullable Output<MethodMapArgs> methodMap) {
            $.methodMap = methodMap;
            return this;
        }

        public Builder methodMap(MethodMapArgs methodMap) {
            return methodMap(Output.of(methodMap));
        }

        public Builder options(@Nullable Output<OptionsArgs> options) {
            $.options = options;
            return this;
        }

        public Builder options(OptionsArgs options) {
            return options(Output.of(options));
        }

        public CollectionOverrideArgs build() {
            return $;
        }
    }

}
