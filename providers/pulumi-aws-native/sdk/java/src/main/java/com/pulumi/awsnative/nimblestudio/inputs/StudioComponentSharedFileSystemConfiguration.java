// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;The configuration for a shared file storage system that is associated with a studio resource.&lt;/p&gt;
 * 
 */
public final class StudioComponentSharedFileSystemConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final StudioComponentSharedFileSystemConfiguration Empty = new StudioComponentSharedFileSystemConfiguration();

    /**
     * &lt;p&gt;The endpoint of the shared file system that is accessed by the studio component resource.&lt;/p&gt;
     * 
     */
    @Import(name="endpoint")
    private @Nullable String endpoint;

    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * &lt;p&gt;The unique identifier for a file system.&lt;/p&gt;
     * 
     */
    @Import(name="fileSystemId")
    private @Nullable String fileSystemId;

    public Optional<String> fileSystemId() {
        return Optional.ofNullable(this.fileSystemId);
    }

    /**
     * &lt;p&gt;The mount location for a shared file system on a Linux virtual workstation.&lt;/p&gt;
     * 
     */
    @Import(name="linuxMountPoint")
    private @Nullable String linuxMountPoint;

    public Optional<String> linuxMountPoint() {
        return Optional.ofNullable(this.linuxMountPoint);
    }

    /**
     * &lt;p&gt;The name of the file share.&lt;/p&gt;
     * 
     */
    @Import(name="shareName")
    private @Nullable String shareName;

    public Optional<String> shareName() {
        return Optional.ofNullable(this.shareName);
    }

    /**
     * &lt;p&gt;The mount location for a shared file system on a Windows virtual workstation.&lt;/p&gt;
     * 
     */
    @Import(name="windowsMountDrive")
    private @Nullable String windowsMountDrive;

    public Optional<String> windowsMountDrive() {
        return Optional.ofNullable(this.windowsMountDrive);
    }

    private StudioComponentSharedFileSystemConfiguration() {}

    private StudioComponentSharedFileSystemConfiguration(StudioComponentSharedFileSystemConfiguration $) {
        this.endpoint = $.endpoint;
        this.fileSystemId = $.fileSystemId;
        this.linuxMountPoint = $.linuxMountPoint;
        this.shareName = $.shareName;
        this.windowsMountDrive = $.windowsMountDrive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StudioComponentSharedFileSystemConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StudioComponentSharedFileSystemConfiguration $;

        public Builder() {
            $ = new StudioComponentSharedFileSystemConfiguration();
        }

        public Builder(StudioComponentSharedFileSystemConfiguration defaults) {
            $ = new StudioComponentSharedFileSystemConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder endpoint(@Nullable String endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder fileSystemId(@Nullable String fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        public Builder linuxMountPoint(@Nullable String linuxMountPoint) {
            $.linuxMountPoint = linuxMountPoint;
            return this;
        }

        public Builder shareName(@Nullable String shareName) {
            $.shareName = shareName;
            return this;
        }

        public Builder windowsMountDrive(@Nullable String windowsMountDrive) {
            $.windowsMountDrive = windowsMountDrive;
            return this;
        }

        public StudioComponentSharedFileSystemConfiguration build() {
            return $;
        }
    }

}
