// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.Capabilities;
import com.pulumi.kubernetes.core_v1.outputs.SELinuxOptions;
import com.pulumi.kubernetes.core_v1.outputs.SeccompProfile;
import com.pulumi.kubernetes.core_v1.outputs.WindowsSecurityContextOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityContext {
    /**
     * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable Boolean allowPrivilegeEscalation;
    /**
     * The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable Capabilities capabilities;
    /**
     * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable Boolean privileged;
    /**
     * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable String procMount;
    /**
     * Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable Boolean readOnlyRootFilesystem;
    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable Integer runAsGroup;
    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    private final @Nullable Boolean runAsNonRoot;
    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable Integer runAsUser;
    /**
     * The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable SELinuxOptions seLinuxOptions;
    /**
     * The seccomp options to use by this container. If seccomp options are provided at both the pod &amp; container level, the container options override the pod options. Note that this field cannot be set when spec.os.name is windows.
     * 
     */
    private final @Nullable SeccompProfile seccompProfile;
    /**
     * The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
     * 
     */
    private final @Nullable WindowsSecurityContextOptions windowsOptions;

    @CustomType.Constructor
    private SecurityContext(
        @CustomType.Parameter("allowPrivilegeEscalation") @Nullable Boolean allowPrivilegeEscalation,
        @CustomType.Parameter("capabilities") @Nullable Capabilities capabilities,
        @CustomType.Parameter("privileged") @Nullable Boolean privileged,
        @CustomType.Parameter("procMount") @Nullable String procMount,
        @CustomType.Parameter("readOnlyRootFilesystem") @Nullable Boolean readOnlyRootFilesystem,
        @CustomType.Parameter("runAsGroup") @Nullable Integer runAsGroup,
        @CustomType.Parameter("runAsNonRoot") @Nullable Boolean runAsNonRoot,
        @CustomType.Parameter("runAsUser") @Nullable Integer runAsUser,
        @CustomType.Parameter("seLinuxOptions") @Nullable SELinuxOptions seLinuxOptions,
        @CustomType.Parameter("seccompProfile") @Nullable SeccompProfile seccompProfile,
        @CustomType.Parameter("windowsOptions") @Nullable WindowsSecurityContextOptions windowsOptions) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.capabilities = capabilities;
        this.privileged = privileged;
        this.procMount = procMount;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.seccompProfile = seccompProfile;
        this.windowsOptions = windowsOptions;
    }

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN Note that this field cannot be set when spec.os.name is windows.
     * 
    */
    public Optional<Boolean> allowPrivilegeEscalation() {
        return Optional.ofNullable(this.allowPrivilegeEscalation);
    }
    /**
     * The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime. Note that this field cannot be set when spec.os.name is windows.
     * 
    */
    public Optional<Capabilities> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }
    /**
     * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. Note that this field cannot be set when spec.os.name is windows.
     * 
    */
    public Optional<Boolean> privileged() {
        return Optional.ofNullable(this.privileged);
    }
    /**
     * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled. Note that this field cannot be set when spec.os.name is windows.
     * 
    */
    public Optional<String> procMount() {
        return Optional.ofNullable(this.procMount);
    }
    /**
     * Whether this container has a read-only root filesystem. Default is false. Note that this field cannot be set when spec.os.name is windows.
     * 
    */
    public Optional<Boolean> readOnlyRootFilesystem() {
        return Optional.ofNullable(this.readOnlyRootFilesystem);
    }
    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
    */
    public Optional<Integer> runAsGroup() {
        return Optional.ofNullable(this.runAsGroup);
    }
    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
    */
    public Optional<Boolean> runAsNonRoot() {
        return Optional.ofNullable(this.runAsNonRoot);
    }
    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
    */
    public Optional<Integer> runAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }
    /**
     * The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is windows.
     * 
    */
    public Optional<SELinuxOptions> seLinuxOptions() {
        return Optional.ofNullable(this.seLinuxOptions);
    }
    /**
     * The seccomp options to use by this container. If seccomp options are provided at both the pod &amp; container level, the container options override the pod options. Note that this field cannot be set when spec.os.name is windows.
     * 
    */
    public Optional<SeccompProfile> seccompProfile() {
        return Optional.ofNullable(this.seccompProfile);
    }
    /**
     * The Windows specific settings applied to all containers. If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
     * 
    */
    public Optional<WindowsSecurityContextOptions> windowsOptions() {
        return Optional.ofNullable(this.windowsOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContext defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowPrivilegeEscalation;
        private @Nullable Capabilities capabilities;
        private @Nullable Boolean privileged;
        private @Nullable String procMount;
        private @Nullable Boolean readOnlyRootFilesystem;
        private @Nullable Integer runAsGroup;
        private @Nullable Boolean runAsNonRoot;
        private @Nullable Integer runAsUser;
        private @Nullable SELinuxOptions seLinuxOptions;
        private @Nullable SeccompProfile seccompProfile;
        private @Nullable WindowsSecurityContextOptions windowsOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPrivilegeEscalation = defaults.allowPrivilegeEscalation;
    	      this.capabilities = defaults.capabilities;
    	      this.privileged = defaults.privileged;
    	      this.procMount = defaults.procMount;
    	      this.readOnlyRootFilesystem = defaults.readOnlyRootFilesystem;
    	      this.runAsGroup = defaults.runAsGroup;
    	      this.runAsNonRoot = defaults.runAsNonRoot;
    	      this.runAsUser = defaults.runAsUser;
    	      this.seLinuxOptions = defaults.seLinuxOptions;
    	      this.seccompProfile = defaults.seccompProfile;
    	      this.windowsOptions = defaults.windowsOptions;
        }

        public Builder allowPrivilegeEscalation(@Nullable Boolean allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }
        public Builder capabilities(@Nullable Capabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder privileged(@Nullable Boolean privileged) {
            this.privileged = privileged;
            return this;
        }
        public Builder procMount(@Nullable String procMount) {
            this.procMount = procMount;
            return this;
        }
        public Builder readOnlyRootFilesystem(@Nullable Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Builder runAsGroup(@Nullable Integer runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }
        public Builder runAsNonRoot(@Nullable Boolean runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }
        public Builder runAsUser(@Nullable Integer runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Builder seLinuxOptions(@Nullable SELinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }
        public Builder seccompProfile(@Nullable SeccompProfile seccompProfile) {
            this.seccompProfile = seccompProfile;
            return this;
        }
        public Builder windowsOptions(@Nullable WindowsSecurityContextOptions windowsOptions) {
            this.windowsOptions = windowsOptions;
            return this;
        }        public SecurityContext build() {
            return new SecurityContext(allowPrivilegeEscalation, capabilities, privileged, procMount, readOnlyRootFilesystem, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, seccompProfile, windowsOptions);
        }
    }
}
