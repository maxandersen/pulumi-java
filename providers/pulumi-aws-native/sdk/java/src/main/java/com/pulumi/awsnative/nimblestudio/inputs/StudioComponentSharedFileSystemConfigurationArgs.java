// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;The configuration for a shared file storage system that is associated with a studio resource.&lt;/p&gt;
 * 
 */
public final class StudioComponentSharedFileSystemConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StudioComponentSharedFileSystemConfigurationArgs Empty = new StudioComponentSharedFileSystemConfigurationArgs();

    /**
     * &lt;p&gt;The endpoint of the shared file system that is accessed by the studio component resource.&lt;/p&gt;
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * &lt;p&gt;The unique identifier for a file system.&lt;/p&gt;
     * 
     */
    @Import(name="fileSystemId")
    private @Nullable Output<String> fileSystemId;

    public Optional<Output<String>> fileSystemId() {
        return Optional.ofNullable(this.fileSystemId);
    }

    /**
     * &lt;p&gt;The mount location for a shared file system on a Linux virtual workstation.&lt;/p&gt;
     * 
     */
    @Import(name="linuxMountPoint")
    private @Nullable Output<String> linuxMountPoint;

    public Optional<Output<String>> linuxMountPoint() {
        return Optional.ofNullable(this.linuxMountPoint);
    }

    /**
     * &lt;p&gt;The name of the file share.&lt;/p&gt;
     * 
     */
    @Import(name="shareName")
    private @Nullable Output<String> shareName;

    public Optional<Output<String>> shareName() {
        return Optional.ofNullable(this.shareName);
    }

    /**
     * &lt;p&gt;The mount location for a shared file system on a Windows virtual workstation.&lt;/p&gt;
     * 
     */
    @Import(name="windowsMountDrive")
    private @Nullable Output<String> windowsMountDrive;

    public Optional<Output<String>> windowsMountDrive() {
        return Optional.ofNullable(this.windowsMountDrive);
    }

    private StudioComponentSharedFileSystemConfigurationArgs() {}

    private StudioComponentSharedFileSystemConfigurationArgs(StudioComponentSharedFileSystemConfigurationArgs $) {
        this.endpoint = $.endpoint;
        this.fileSystemId = $.fileSystemId;
        this.linuxMountPoint = $.linuxMountPoint;
        this.shareName = $.shareName;
        this.windowsMountDrive = $.windowsMountDrive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StudioComponentSharedFileSystemConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StudioComponentSharedFileSystemConfigurationArgs $;

        public Builder() {
            $ = new StudioComponentSharedFileSystemConfigurationArgs();
        }

        public Builder(StudioComponentSharedFileSystemConfigurationArgs defaults) {
            $ = new StudioComponentSharedFileSystemConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder fileSystemId(@Nullable Output<String> fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        public Builder fileSystemId(String fileSystemId) {
            return fileSystemId(Output.of(fileSystemId));
        }

        public Builder linuxMountPoint(@Nullable Output<String> linuxMountPoint) {
            $.linuxMountPoint = linuxMountPoint;
            return this;
        }

        public Builder linuxMountPoint(String linuxMountPoint) {
            return linuxMountPoint(Output.of(linuxMountPoint));
        }

        public Builder shareName(@Nullable Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public Builder windowsMountDrive(@Nullable Output<String> windowsMountDrive) {
            $.windowsMountDrive = windowsMountDrive;
            return this;
        }

        public Builder windowsMountDrive(String windowsMountDrive) {
            return windowsMountDrive(Output.of(windowsMountDrive));
        }

        public StudioComponentSharedFileSystemConfigurationArgs build() {
            return $;
        }
    }

}
