// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecretReference {
    /**
     * Name is unique within a namespace to reference a secret resource.
     * 
     */
    private final @Nullable String name;
    /**
     * Namespace defines the space within which the secret name must be unique.
     * 
     */
    private final @Nullable String namespace;

    @OutputCustomType.Constructor({"name","namespace"})
    private SecretReference(
        @Nullable String name,
        @Nullable String namespace) {
        this.name = name;
        this.namespace = namespace;
    }

    /**
     * Name is unique within a namespace to reference a secret resource.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Namespace defines the space within which the secret name must be unique.
     * 
     */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public SecretReference build() {
            return new SecretReference(name, namespace);
        }
    }
}
