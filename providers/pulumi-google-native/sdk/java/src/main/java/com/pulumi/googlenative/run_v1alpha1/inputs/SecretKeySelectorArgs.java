// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.run_v1alpha1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SecretKeySelector selects a key of a Secret.
 * 
 */
public final class SecretKeySelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretKeySelectorArgs Empty = new SecretKeySelectorArgs();

    /**
     * A Cloud Secret Manager secret version. Must be &#39;latest&#39; for the latest version or an integer for a specific version. The key of the secret to select from. Must be a valid secret key.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the &#34;name&#34; field instead.
     * 
     */
    @Import(name="localObjectReference")
      private final @Nullable Output<LocalObjectReferenceArgs> localObjectReference;

    public Output<LocalObjectReferenceArgs> localObjectReference() {
        return this.localObjectReference == null ? Codegen.empty() : this.localObjectReference;
    }

    /**
     * The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. The name of the secret in the pod&#39;s namespace to select from.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * (Optional) Specify whether the Secret or its key must be defined
     * 
     */
    @Import(name="optional")
      private final @Nullable Output<Boolean> optional;

    public Output<Boolean> optional() {
        return this.optional == null ? Codegen.empty() : this.optional;
    }

    public SecretKeySelectorArgs(
        @Nullable Output<String> key,
        @Nullable Output<LocalObjectReferenceArgs> localObjectReference,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> optional) {
        this.key = key;
        this.localObjectReference = localObjectReference;
        this.name = name;
        this.optional = optional;
    }

    private SecretKeySelectorArgs() {
        this.key = Codegen.empty();
        this.localObjectReference = Codegen.empty();
        this.name = Codegen.empty();
        this.optional = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretKeySelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private @Nullable Output<LocalObjectReferenceArgs> localObjectReference;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretKeySelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder localObjectReference(@Nullable Output<LocalObjectReferenceArgs> localObjectReference) {
            this.localObjectReference = localObjectReference;
            return this;
        }
        public Builder localObjectReference(@Nullable LocalObjectReferenceArgs localObjectReference) {
            this.localObjectReference = Codegen.ofNullable(localObjectReference);
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
        public Builder optional(@Nullable Output<Boolean> optional) {
            this.optional = optional;
            return this;
        }
        public Builder optional(@Nullable Boolean optional) {
            this.optional = Codegen.ofNullable(optional);
            return this;
        }        public SecretKeySelectorArgs build() {
            return new SecretKeySelectorArgs(key, localObjectReference, name, optional);
        }
    }
}
