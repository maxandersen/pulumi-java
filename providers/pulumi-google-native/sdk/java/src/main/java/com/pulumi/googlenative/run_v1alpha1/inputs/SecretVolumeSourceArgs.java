// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.run_v1alpha1.inputs.KeyToPathArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The secret's value will be presented as the content of a file whose name is defined in the item path. If no items are defined, the name of the file is the secret_name. The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names.
 * 
 */
public final class SecretVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretVolumeSourceArgs Empty = new SecretVolumeSourceArgs();

    /**
     * Integer representation of mode bits to use on created files by default. Must be a value between 01 and 0777 (octal). If 0 or not set, it will default to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="defaultMode")
      private final @Nullable Output<Integer> defaultMode;

    public Output<Integer> defaultMode() {
        return this.defaultMode == null ? Codegen.empty() : this.defaultMode;
    }

    /**
     * (Optional) If unspecified, the volume will expose a file whose name is the secret_name. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a key and a path. If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified that is not present in the Secret, the volume setup will error unless it is marked optional.
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<KeyToPathArgs>> items;

    public Output<List<KeyToPathArgs>> items() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    /**
     * (Optional) Specify whether the Secret or its keys must be defined.
     * 
     */
    @Import(name="optional")
      private final @Nullable Output<Boolean> optional;

    public Output<Boolean> optional() {
        return this.optional == null ? Codegen.empty() : this.optional;
    }

    /**
     * The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. Name of the secret in the container's namespace to use.
     * 
     */
    @Import(name="secretName")
      private final @Nullable Output<String> secretName;

    public Output<String> secretName() {
        return this.secretName == null ? Codegen.empty() : this.secretName;
    }

    public SecretVolumeSourceArgs(
        @Nullable Output<Integer> defaultMode,
        @Nullable Output<List<KeyToPathArgs>> items,
        @Nullable Output<Boolean> optional,
        @Nullable Output<String> secretName) {
        this.defaultMode = defaultMode;
        this.items = items;
        this.optional = optional;
        this.secretName = secretName;
    }

    private SecretVolumeSourceArgs() {
        this.defaultMode = Codegen.empty();
        this.items = Codegen.empty();
        this.optional = Codegen.empty();
        this.secretName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> defaultMode;
        private @Nullable Output<List<KeyToPathArgs>> items;
        private @Nullable Output<Boolean> optional;
        private @Nullable Output<String> secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.optional = defaults.optional;
    	      this.secretName = defaults.secretName;
        }

        public Builder defaultMode(@Nullable Output<Integer> defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }
        public Builder defaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = Codegen.ofNullable(defaultMode);
            return this;
        }
        public Builder items(@Nullable Output<List<KeyToPathArgs>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<KeyToPathArgs> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(KeyToPathArgs... items) {
            return items(List.of(items));
        }
        public Builder optional(@Nullable Output<Boolean> optional) {
            this.optional = optional;
            return this;
        }
        public Builder optional(@Nullable Boolean optional) {
            this.optional = Codegen.ofNullable(optional);
            return this;
        }
        public Builder secretName(@Nullable Output<String> secretName) {
            this.secretName = secretName;
            return this;
        }
        public Builder secretName(@Nullable String secretName) {
            this.secretName = Codegen.ofNullable(secretName);
            return this;
        }        public SecretVolumeSourceArgs build() {
            return new SecretVolumeSourceArgs(defaultMode, items, optional, secretName);
        }
    }
}
