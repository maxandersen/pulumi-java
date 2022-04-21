// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Provides information about the drive&#39;s status
 * 
 */
public final class DriveStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final DriveStatusResponse Empty = new DriveStatusResponse();

    /**
     * The BitLocker key used to encrypt the drive.
     * 
     */
    @Import(name="bitLockerKey")
    private @Nullable String bitLockerKey;

    public Optional<String> bitLockerKey() {
        return Optional.ofNullable(this.bitLockerKey);
    }

    /**
     * Bytes successfully transferred for the drive.
     * 
     */
    @Import(name="bytesSucceeded")
    private @Nullable Double bytesSucceeded;

    public Optional<Double> bytesSucceeded() {
        return Optional.ofNullable(this.bytesSucceeded);
    }

    /**
     * Detailed status about the data transfer process. This field is not returned in the response until the drive is in the Transferring state.
     * 
     */
    @Import(name="copyStatus")
    private @Nullable String copyStatus;

    public Optional<String> copyStatus() {
        return Optional.ofNullable(this.copyStatus);
    }

    /**
     * The drive header hash value.
     * 
     */
    @Import(name="driveHeaderHash")
    private @Nullable String driveHeaderHash;

    public Optional<String> driveHeaderHash() {
        return Optional.ofNullable(this.driveHeaderHash);
    }

    /**
     * The drive&#39;s hardware serial number, without spaces.
     * 
     */
    @Import(name="driveId")
    private @Nullable String driveId;

    public Optional<String> driveId() {
        return Optional.ofNullable(this.driveId);
    }

    /**
     * A URI that points to the blob containing the error log for the data transfer operation.
     * 
     */
    @Import(name="errorLogUri")
    private @Nullable String errorLogUri;

    public Optional<String> errorLogUri() {
        return Optional.ofNullable(this.errorLogUri);
    }

    /**
     * The relative path of the manifest file on the drive.
     * 
     */
    @Import(name="manifestFile")
    private @Nullable String manifestFile;

    public Optional<String> manifestFile() {
        return Optional.ofNullable(this.manifestFile);
    }

    /**
     * The Base16-encoded MD5 hash of the manifest file on the drive.
     * 
     */
    @Import(name="manifestHash")
    private @Nullable String manifestHash;

    public Optional<String> manifestHash() {
        return Optional.ofNullable(this.manifestHash);
    }

    /**
     * A URI that points to the blob containing the drive manifest file.
     * 
     */
    @Import(name="manifestUri")
    private @Nullable String manifestUri;

    public Optional<String> manifestUri() {
        return Optional.ofNullable(this.manifestUri);
    }

    /**
     * Percentage completed for the drive.
     * 
     */
    @Import(name="percentComplete")
    private @Nullable Integer percentComplete;

    public Optional<Integer> percentComplete() {
        return Optional.ofNullable(this.percentComplete);
    }

    /**
     * The drive&#39;s current state.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A URI that points to the blob containing the verbose log for the data transfer operation.
     * 
     */
    @Import(name="verboseLogUri")
    private @Nullable String verboseLogUri;

    public Optional<String> verboseLogUri() {
        return Optional.ofNullable(this.verboseLogUri);
    }

    private DriveStatusResponse() {}

    private DriveStatusResponse(DriveStatusResponse $) {
        this.bitLockerKey = $.bitLockerKey;
        this.bytesSucceeded = $.bytesSucceeded;
        this.copyStatus = $.copyStatus;
        this.driveHeaderHash = $.driveHeaderHash;
        this.driveId = $.driveId;
        this.errorLogUri = $.errorLogUri;
        this.manifestFile = $.manifestFile;
        this.manifestHash = $.manifestHash;
        this.manifestUri = $.manifestUri;
        this.percentComplete = $.percentComplete;
        this.state = $.state;
        this.verboseLogUri = $.verboseLogUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DriveStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DriveStatusResponse $;

        public Builder() {
            $ = new DriveStatusResponse();
        }

        public Builder(DriveStatusResponse defaults) {
            $ = new DriveStatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder bitLockerKey(@Nullable String bitLockerKey) {
            $.bitLockerKey = bitLockerKey;
            return this;
        }

        public Builder bytesSucceeded(@Nullable Double bytesSucceeded) {
            $.bytesSucceeded = bytesSucceeded;
            return this;
        }

        public Builder copyStatus(@Nullable String copyStatus) {
            $.copyStatus = copyStatus;
            return this;
        }

        public Builder driveHeaderHash(@Nullable String driveHeaderHash) {
            $.driveHeaderHash = driveHeaderHash;
            return this;
        }

        public Builder driveId(@Nullable String driveId) {
            $.driveId = driveId;
            return this;
        }

        public Builder errorLogUri(@Nullable String errorLogUri) {
            $.errorLogUri = errorLogUri;
            return this;
        }

        public Builder manifestFile(@Nullable String manifestFile) {
            $.manifestFile = manifestFile;
            return this;
        }

        public Builder manifestHash(@Nullable String manifestHash) {
            $.manifestHash = manifestHash;
            return this;
        }

        public Builder manifestUri(@Nullable String manifestUri) {
            $.manifestUri = manifestUri;
            return this;
        }

        public Builder percentComplete(@Nullable Integer percentComplete) {
            $.percentComplete = percentComplete;
            return this;
        }

        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public Builder verboseLogUri(@Nullable String verboseLogUri) {
            $.verboseLogUri = verboseLogUri;
            return this;
        }

        public DriveStatusResponse build() {
            $.state = Codegen.stringProp("state").arg($.state).def("Specified").getNullable();
            return $;
        }
    }

}
