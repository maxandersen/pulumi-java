// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
 * 
 */
public final class SecretReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretReferenceArgs Empty = new SecretReferenceArgs();

    /**
     * Name is unique within a namespace to reference a secret resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Namespace defines the space within which the secret name must be unique.
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public SecretReferenceArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> namespace) {
        this.name = name;
        this.namespace = namespace;
    }

    private SecretReferenceArgs() {
        this.name = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public SecretReferenceArgs build() {
            return new SecretReferenceArgs(name, namespace);
        }
    }
}
