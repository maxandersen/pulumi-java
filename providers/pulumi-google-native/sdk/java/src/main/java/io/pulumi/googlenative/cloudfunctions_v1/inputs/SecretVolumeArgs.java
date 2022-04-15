// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.SecretVersionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a secret volume. It has the information necessary to fetch the secret value from secret manager and make it available as files mounted at the requested paths within the application container. Secret value is not a part of the configuration. Every filesystem read operation performs a lookup in secret manager to retrieve the secret value.
 * 
 */
public final class SecretVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretVolumeArgs Empty = new SecretVolumeArgs();

    /**
     * The path within the container to mount the secret volume. For example, setting the mount_path as `/etc/secrets` would mount the secret value files under the `/etc/secrets` directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount paths: /etc/secrets Restricted mount paths: /cloudsql, /dev/log, /pod, /proc, /var/log
     * 
     */
    @Import(name="mountPath")
      private final @Nullable Output<String> mountPath;

    public Output<String> mountPath() {
        return this.mountPath == null ? Codegen.empty() : this.mountPath;
    }

    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function's project assuming that the secret exists in the same project as of the function.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
     */
    @Import(name="secret")
      private final @Nullable Output<String> secret;

    public Output<String> secret() {
        return this.secret == null ? Codegen.empty() : this.secret;
    }

    /**
     * List of secret versions to mount for this secret. If empty, the `latest` version of the secret will be made available in a file named after the secret under the mount point.
     * 
     */
    @Import(name="versions")
      private final @Nullable Output<List<SecretVersionArgs>> versions;

    public Output<List<SecretVersionArgs>> versions() {
        return this.versions == null ? Codegen.empty() : this.versions;
    }

    public SecretVolumeArgs(
        @Nullable Output<String> mountPath,
        @Nullable Output<String> project,
        @Nullable Output<String> secret,
        @Nullable Output<List<SecretVersionArgs>> versions) {
        this.mountPath = mountPath;
        this.project = project;
        this.secret = secret;
        this.versions = versions;
    }

    private SecretVolumeArgs() {
        this.mountPath = Codegen.empty();
        this.project = Codegen.empty();
        this.secret = Codegen.empty();
        this.versions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mountPath;
        private @Nullable Output<String> project;
        private @Nullable Output<String> secret;
        private @Nullable Output<List<SecretVersionArgs>> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.versions = defaults.versions;
        }

        public Builder mountPath(@Nullable Output<String> mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = Codegen.ofNullable(mountPath);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder secret(@Nullable Output<String> secret) {
            this.secret = secret;
            return this;
        }
        public Builder secret(@Nullable String secret) {
            this.secret = Codegen.ofNullable(secret);
            return this;
        }
        public Builder versions(@Nullable Output<List<SecretVersionArgs>> versions) {
            this.versions = versions;
            return this;
        }
        public Builder versions(@Nullable List<SecretVersionArgs> versions) {
            this.versions = Codegen.ofNullable(versions);
            return this;
        }
        public Builder versions(SecretVersionArgs... versions) {
            return versions(List.of(versions));
        }        public SecretVolumeArgs build() {
            return new SecretVolumeArgs(mountPath, project, secret, versions);
        }
    }
}
