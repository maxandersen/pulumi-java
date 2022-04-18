// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.storage.TransferJobArgs;
import com.pulumi.gcp.storage.inputs.TransferJobState;
import com.pulumi.gcp.storage.outputs.TransferJobSchedule;
import com.pulumi.gcp.storage.outputs.TransferJobTransferSpec;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Transfer Job in Google Cloud Storage Transfer.
 * 
 * To get more information about Google Cloud Storage Transfer, see:
 * 
 * * [Overview](https://cloud.google.com/storage-transfer/docs/overview)
 * * [API documentation](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/transferJobs)
 * * How-to Guides
 *     * [Configuring Access to Data Sources and Sinks](https://cloud.google.com/storage-transfer/docs/configure-access)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Storage buckets can be imported using the Transfer Job's `project` and `name` without the `transferJob/` prefix, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:storage/transferJob:TransferJob nightly-backup-transfer-job my-project-1asd32/8422144862922355674
 * ```
 * 
 */
@ResourceType(type="gcp:storage/transferJob:TransferJob")
public class TransferJob extends com.pulumi.resources.CustomResource {
    /**
     * When the Transfer Job was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return When the Transfer Job was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * When the Transfer Job was deleted.
     * 
     */
    @Export(name="deletionTime", type=String.class, parameters={})
    private Output<String> deletionTime;

    /**
     * @return When the Transfer Job was deleted.
     * 
     */
    public Output<String> deletionTime() {
        return this.deletionTime;
    }
    /**
     * Unique description to identify the Transfer Job.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Unique description to identify the Transfer Job.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * When the Transfer Job was last modified.
     * 
     */
    @Export(name="lastModificationTime", type=String.class, parameters={})
    private Output<String> lastModificationTime;

    /**
     * @return When the Transfer Job was last modified.
     * 
     */
    public Output<String> lastModificationTime() {
        return this.lastModificationTime;
    }
    /**
     * The name of the Transfer Job.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Transfer Job.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Schedule specification defining when the Transfer Job should be scheduled to start, end and what time to run. Structure documented below.
     * 
     */
    @Export(name="schedule", type=TransferJobSchedule.class, parameters={})
    private Output</* @Nullable */ TransferJobSchedule> schedule;

    /**
     * @return Schedule specification defining when the Transfer Job should be scheduled to start, end and what time to run. Structure documented below.
     * 
     */
    public Output</* @Nullable */ TransferJobSchedule> schedule() {
        return this.schedule;
    }
    /**
     * Status of the job. Default: `ENABLED`. **NOTE: The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.**
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the job. Default: `ENABLED`. **NOTE: The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.**
     * 
     */
    public Output</* @Nullable */ String> status() {
        return this.status;
    }
    /**
     * Transfer specification. Structure documented below.
     * 
     */
    @Export(name="transferSpec", type=TransferJobTransferSpec.class, parameters={})
    private Output<TransferJobTransferSpec> transferSpec;

    /**
     * @return Transfer specification. Structure documented below.
     * 
     */
    public Output<TransferJobTransferSpec> transferSpec() {
        return this.transferSpec;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransferJob(String name) {
        this(name, TransferJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransferJob(String name, TransferJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransferJob(String name, TransferJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/transferJob:TransferJob", name, args == null ? TransferJobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransferJob(String name, Output<String> id, @Nullable TransferJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/transferJob:TransferJob", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TransferJob get(String name, Output<String> id, @Nullable TransferJobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransferJob(name, id, state, options);
    }
}
