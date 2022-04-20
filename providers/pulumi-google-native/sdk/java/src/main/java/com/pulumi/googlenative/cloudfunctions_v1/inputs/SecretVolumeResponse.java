// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudfunctions_v1.inputs.SecretVersionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration for a secret volume. It has the information necessary to fetch the secret value from secret manager and make it available as files mounted at the requested paths within the application container. Secret value is not a part of the configuration. Every filesystem read operation performs a lookup in secret manager to retrieve the secret value.
 * 
 */
public final class SecretVolumeResponse extends com.pulumi.resources.InvokeArgs {

    public static final SecretVolumeResponse Empty = new SecretVolumeResponse();

    /**
     * The path within the container to mount the secret volume. For example, setting the mount_path as `/etc/secrets` would mount the secret value files under the `/etc/secrets` directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount paths: /etc/secrets Restricted mount paths: /cloudsql, /dev/log, /pod, /proc, /var/log
     * 
     */
    @Import(name="mountPath", required=true)
      private final String mountPath;

    public String mountPath() {
        return this.mountPath;
    }

    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function&#39;s project assuming that the secret exists in the same project as of the function.
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String project() {
        return this.project;
    }

    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
     */
    @Import(name="secret", required=true)
      private final String secret;

    public String secret() {
        return this.secret;
    }

    /**
     * List of secret versions to mount for this secret. If empty, the `latest` version of the secret will be made available in a file named after the secret under the mount point.
     * 
     */
    @Import(name="versions", required=true)
      private final List<SecretVersionResponse> versions;

    public List<SecretVersionResponse> versions() {
        return this.versions;
    }

    public SecretVolumeResponse(
        String mountPath,
        String project,
        String secret,
        List<SecretVersionResponse> versions) {
        this.mountPath = Objects.requireNonNull(mountPath, "expected parameter 'mountPath' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
        this.versions = Objects.requireNonNull(versions, "expected parameter 'versions' to be non-null");
    }

    private SecretVolumeResponse() {
        this.mountPath = null;
        this.project = null;
        this.secret = null;
        this.versions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String project;
        private String secret;
        private List<SecretVersionResponse> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.versions = defaults.versions;
        }

        public Builder mountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public Builder versions(List<SecretVersionResponse> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(SecretVersionResponse... versions) {
            return versions(List.of(versions));
        }        public SecretVolumeResponse build() {
            return new SecretVolumeResponse(mountPath, project, secret, versions);
        }
    }
}
