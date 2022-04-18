// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.quicksight.DashboardArgs;
import com.pulumi.awsnative.quicksight.outputs.DashboardParameters;
import com.pulumi.awsnative.quicksight.outputs.DashboardPublishOptions;
import com.pulumi.awsnative.quicksight.outputs.DashboardResourcePermission;
import com.pulumi.awsnative.quicksight.outputs.DashboardSourceEntity;
import com.pulumi.awsnative.quicksight.outputs.DashboardTag;
import com.pulumi.awsnative.quicksight.outputs.DashboardVersion;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of the AWS::QuickSight::Dashboard Resource Type.
 * 
 */
@ResourceType(type="aws-native:quicksight:Dashboard")
public class Dashboard extends com.pulumi.resources.CustomResource {
    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="awsAccountId", type=String.class, parameters={})
    private Output<String> awsAccountId;

    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * <p>The time that this dataset was created.</p>
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return <p>The time that this dataset was created.</p>
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    @Export(name="dashboardId", type=String.class, parameters={})
    private Output<String> dashboardId;

    public Output<String> dashboardId() {
        return this.dashboardId;
    }
    @Export(name="dashboardPublishOptions", type=DashboardPublishOptions.class, parameters={})
    private Output</* @Nullable */ DashboardPublishOptions> dashboardPublishOptions;

    public Output</* @Nullable */ DashboardPublishOptions> dashboardPublishOptions() {
        return this.dashboardPublishOptions;
    }
    /**
     * <p>The last time that this dataset was published.</p>
     * 
     */
    @Export(name="lastPublishedTime", type=String.class, parameters={})
    private Output<String> lastPublishedTime;

    /**
     * @return <p>The last time that this dataset was published.</p>
     * 
     */
    public Output<String> lastPublishedTime() {
        return this.lastPublishedTime;
    }
    /**
     * <p>The last time that this dataset was updated.</p>
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return <p>The last time that this dataset was updated.</p>
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * <p>The display name of the dashboard.</p>
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return <p>The display name of the dashboard.</p>
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    @Export(name="parameters", type=DashboardParameters.class, parameters={})
    private Output</* @Nullable */ DashboardParameters> parameters;

    public Output</* @Nullable */ DashboardParameters> parameters() {
        return this.parameters;
    }
    /**
     * <p>A structure that contains the permissions of the dashboard. You can use this structure
     *             for granting permissions by providing a list of IAM action information for each
     *             principal ARN. </p>
     * 
     *         <p>To specify no permissions, omit the permissions list.</p>
     * 
     */
    @Export(name="permissions", type=List.class, parameters={DashboardResourcePermission.class})
    private Output</* @Nullable */ List<DashboardResourcePermission>> permissions;

    /**
     * @return <p>A structure that contains the permissions of the dashboard. You can use this structure
     *             for granting permissions by providing a list of IAM action information for each
     *             principal ARN. </p>
     * 
     *         <p>To specify no permissions, omit the permissions list.</p>
     * 
     */
    public Output</* @Nullable */ List<DashboardResourcePermission>> permissions() {
        return this.permissions;
    }
    @Export(name="sourceEntity", type=DashboardSourceEntity.class, parameters={})
    private Output<DashboardSourceEntity> sourceEntity;

    public Output<DashboardSourceEntity> sourceEntity() {
        return this.sourceEntity;
    }
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the
     *             dashboard.</p>
     * 
     */
    @Export(name="tags", type=List.class, parameters={DashboardTag.class})
    private Output</* @Nullable */ List<DashboardTag>> tags;

    /**
     * @return <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the
     *             dashboard.</p>
     * 
     */
    public Output</* @Nullable */ List<DashboardTag>> tags() {
        return this.tags;
    }
    /**
     * <p>The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. If
     *             you add a value for this field, it overrides the value that is used in the source
     *             entity. The theme ARN must exist in the same AWS account where you create the
     *             dashboard.</p>
     * 
     */
    @Export(name="themeArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> themeArn;

    /**
     * @return <p>The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. If
     *             you add a value for this field, it overrides the value that is used in the source
     *             entity. The theme ARN must exist in the same AWS account where you create the
     *             dashboard.</p>
     * 
     */
    public Output</* @Nullable */ String> themeArn() {
        return this.themeArn;
    }
    @Export(name="version", type=DashboardVersion.class, parameters={})
    private Output<DashboardVersion> version;

    public Output<DashboardVersion> version() {
        return this.version;
    }
    /**
     * <p>A description for the first version of the dashboard being created.</p>
     * 
     */
    @Export(name="versionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> versionDescription;

    /**
     * @return <p>A description for the first version of the dashboard being created.</p>
     * 
     */
    public Output</* @Nullable */ String> versionDescription() {
        return this.versionDescription;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dashboard(String name) {
        this(name, DashboardArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dashboard(String name, DashboardArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dashboard(String name, DashboardArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:Dashboard", name, args == null ? DashboardArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Dashboard(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:Dashboard", name, null, makeResourceOptions(options, id));
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
    public static Dashboard get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Dashboard(name, id, options);
    }
}
