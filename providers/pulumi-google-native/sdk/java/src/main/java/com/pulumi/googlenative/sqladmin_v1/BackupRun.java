// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.sqladmin_v1.BackupRunArgs;
import com.pulumi.googlenative.sqladmin_v1.outputs.DiskEncryptionConfigurationResponse;
import com.pulumi.googlenative.sqladmin_v1.outputs.DiskEncryptionStatusResponse;
import com.pulumi.googlenative.sqladmin_v1.outputs.OperationErrorResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new backup run on demand.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:sqladmin/v1:BackupRun")
public class BackupRun extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the kind of backup, PHYSICAL or DEFAULT_SNAPSHOT.
     * 
     */
    @Export(name="backupKind", type=String.class, parameters={})
    private Output<String> backupKind;

    /**
     * @return Specifies the kind of backup, PHYSICAL or DEFAULT_SNAPSHOT.
     * 
     */
    public Output<String> backupKind() {
        return this.backupKind;
    }
    /**
     * The description of this run, only applicable to on-demand backups.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of this run, only applicable to on-demand backups.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Encryption configuration specific to a backup.
     * 
     */
    @Export(name="diskEncryptionConfiguration", type=DiskEncryptionConfigurationResponse.class, parameters={})
    private Output<DiskEncryptionConfigurationResponse> diskEncryptionConfiguration;

    /**
     * @return Encryption configuration specific to a backup.
     * 
     */
    public Output<DiskEncryptionConfigurationResponse> diskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }
    /**
     * Encryption status specific to a backup.
     * 
     */
    @Export(name="diskEncryptionStatus", type=DiskEncryptionStatusResponse.class, parameters={})
    private Output<DiskEncryptionStatusResponse> diskEncryptionStatus;

    /**
     * @return Encryption status specific to a backup.
     * 
     */
    public Output<DiskEncryptionStatusResponse> diskEncryptionStatus() {
        return this.diskEncryptionStatus;
    }
    /**
     * The time the backup operation completed in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The time the backup operation completed in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * The time the run was enqueued in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Export(name="enqueuedTime", type=String.class, parameters={})
    private Output<String> enqueuedTime;

    /**
     * @return The time the run was enqueued in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> enqueuedTime() {
        return this.enqueuedTime;
    }
    /**
     * Information about why the backup operation failed. This is only present if the run has the FAILED status.
     * 
     */
    @Export(name="error", type=OperationErrorResponse.class, parameters={})
    private Output<OperationErrorResponse> error;

    /**
     * @return Information about why the backup operation failed. This is only present if the run has the FAILED status.
     * 
     */
    public Output<OperationErrorResponse> error() {
        return this.error;
    }
    /**
     * Name of the database instance.
     * 
     */
    @Export(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return Name of the database instance.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }
    /**
     * This is always `sql#backupRun`.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return This is always `sql#backupRun`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Location of the backups.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the backups.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The URI of this resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of this resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The time the backup operation actually started in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return The time the backup operation actually started in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * The status of this run.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of this run.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The type of this run; can be either "AUTOMATED" or "ON_DEMAND". This field defaults to "ON_DEMAND" and is ignored, when specified for insert requests.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of this run; can be either "AUTOMATED" or "ON_DEMAND". This field defaults to "ON_DEMAND" and is ignored, when specified for insert requests.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The start time of the backup window during which this the backup was attempted in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Export(name="windowStartTime", type=String.class, parameters={})
    private Output<String> windowStartTime;

    /**
     * @return The start time of the backup window during which this the backup was attempted in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> windowStartTime() {
        return this.windowStartTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupRun(String name) {
        this(name, BackupRunArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupRun(String name, BackupRunArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupRun(String name, BackupRunArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1:BackupRun", name, args == null ? BackupRunArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackupRun(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1:BackupRun", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BackupRun get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BackupRun(name, id, options);
    }
}
