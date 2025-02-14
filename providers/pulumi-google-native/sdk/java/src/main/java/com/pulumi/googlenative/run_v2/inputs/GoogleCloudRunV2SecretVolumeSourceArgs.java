// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v2.inputs.GoogleCloudRunV2VersionToPathArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The secret&#39;s value will be presented as the content of a file whose name is defined in the item path. If no items are defined, the name of the file is the secret.
 * 
 */
public final class GoogleCloudRunV2SecretVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunV2SecretVolumeSourceArgs Empty = new GoogleCloudRunV2SecretVolumeSourceArgs();

    /**
     * Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set. This might be in conflict with other options that affect the file mode, like fsGroup, and as a result, other mode bits could be set.
     * 
     */
    @Import(name="defaultMode")
    private @Nullable Output<Integer> defaultMode;

    /**
     * @return Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set. This might be in conflict with other options that affect the file mode, like fsGroup, and as a result, other mode bits could be set.
     * 
     */
    public Optional<Output<Integer>> defaultMode() {
        return Optional.ofNullable(this.defaultMode);
    }

    /**
     * If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<GoogleCloudRunV2VersionToPathArgs>> items;

    /**
     * @return If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
     * 
     */
    public Optional<Output<List<GoogleCloudRunV2VersionToPathArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    /**
     * The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    private GoogleCloudRunV2SecretVolumeSourceArgs() {}

    private GoogleCloudRunV2SecretVolumeSourceArgs(GoogleCloudRunV2SecretVolumeSourceArgs $) {
        this.defaultMode = $.defaultMode;
        this.items = $.items;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunV2SecretVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunV2SecretVolumeSourceArgs $;

        public Builder() {
            $ = new GoogleCloudRunV2SecretVolumeSourceArgs();
        }

        public Builder(GoogleCloudRunV2SecretVolumeSourceArgs defaults) {
            $ = new GoogleCloudRunV2SecretVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultMode Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set. This might be in conflict with other options that affect the file mode, like fsGroup, and as a result, other mode bits could be set.
         * 
         * @return builder
         * 
         */
        public Builder defaultMode(@Nullable Output<Integer> defaultMode) {
            $.defaultMode = defaultMode;
            return this;
        }

        /**
         * @param defaultMode Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0644. Directories within the path are not affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set. This might be in conflict with other options that affect the file mode, like fsGroup, and as a result, other mode bits could be set.
         * 
         * @return builder
         * 
         */
        public Builder defaultMode(Integer defaultMode) {
            return defaultMode(Output.of(defaultMode));
        }

        /**
         * @param items If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<List<GoogleCloudRunV2VersionToPathArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
         * 
         * @return builder
         * 
         */
        public Builder items(List<GoogleCloudRunV2VersionToPathArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
         * 
         * @return builder
         * 
         */
        public Builder items(GoogleCloudRunV2VersionToPathArgs... items) {
            return items(List.of(items));
        }

        /**
         * @param secret The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public GoogleCloudRunV2SecretVolumeSourceArgs build() {
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}
