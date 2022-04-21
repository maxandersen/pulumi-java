// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
 * 
 */
public final class TypedLocalObjectReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TypedLocalObjectReferenceArgs Empty = new TypedLocalObjectReferenceArgs();

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    @Import(name="apiGroup")
    private @Nullable Output<String> apiGroup;

    public Optional<Output<String>> apiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }

    /**
     * Kind is the type of resource being referenced
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Name is the name of resource being referenced
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private TypedLocalObjectReferenceArgs() {}

    private TypedLocalObjectReferenceArgs(TypedLocalObjectReferenceArgs $) {
        this.apiGroup = $.apiGroup;
        this.kind = $.kind;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypedLocalObjectReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypedLocalObjectReferenceArgs $;

        public Builder() {
            $ = new TypedLocalObjectReferenceArgs();
        }

        public Builder(TypedLocalObjectReferenceArgs defaults) {
            $ = new TypedLocalObjectReferenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiGroup(@Nullable Output<String> apiGroup) {
            $.apiGroup = apiGroup;
            return this;
        }

        public Builder apiGroup(String apiGroup) {
            return apiGroup(Output.of(apiGroup));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public TypedLocalObjectReferenceArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
