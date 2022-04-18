// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.sagemaker.ProjectArgs;
import com.pulumi.awsnative.sagemaker.enums.ProjectStatus;
import com.pulumi.awsnative.sagemaker.outputs.ProjectTag;
import com.pulumi.awsnative.sagemaker.outputs.ServiceCatalogProvisionedProductDetailsProperties;
import com.pulumi.awsnative.sagemaker.outputs.ServiceCatalogProvisioningDetailsProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::Project
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:sagemaker:Project")
public class Project extends com.pulumi.resources.CustomResource {
    /**
     * The time at which the project was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time at which the project was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    @Export(name="projectArn", type=String.class, parameters={})
    private Output<String> projectArn;

    public Output<String> projectArn() {
        return this.projectArn;
    }
    @Export(name="projectDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectDescription;

    public Output</* @Nullable */ String> projectDescription() {
        return this.projectDescription;
    }
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }
    @Export(name="projectName", type=String.class, parameters={})
    private Output<String> projectName;

    public Output<String> projectName() {
        return this.projectName;
    }
    /**
     * The status of a project.
     * 
     */
    @Export(name="projectStatus", type=ProjectStatus.class, parameters={})
    private Output<ProjectStatus> projectStatus;

    /**
     * @return The status of a project.
     * 
     */
    public Output<ProjectStatus> projectStatus() {
        return this.projectStatus;
    }
    /**
     * Provisioned ServiceCatalog  Details
     * 
     */
    @Export(name="serviceCatalogProvisionedProductDetails", type=ServiceCatalogProvisionedProductDetailsProperties.class, parameters={})
    private Output<ServiceCatalogProvisionedProductDetailsProperties> serviceCatalogProvisionedProductDetails;

    /**
     * @return Provisioned ServiceCatalog  Details
     * 
     */
    public Output<ServiceCatalogProvisionedProductDetailsProperties> serviceCatalogProvisionedProductDetails() {
        return this.serviceCatalogProvisionedProductDetails;
    }
    /**
     * Input ServiceCatalog Provisioning Details
     * 
     */
    @Export(name="serviceCatalogProvisioningDetails", type=ServiceCatalogProvisioningDetailsProperties.class, parameters={})
    private Output<ServiceCatalogProvisioningDetailsProperties> serviceCatalogProvisioningDetails;

    /**
     * @return Input ServiceCatalog Provisioning Details
     * 
     */
    public Output<ServiceCatalogProvisioningDetailsProperties> serviceCatalogProvisioningDetails() {
        return this.serviceCatalogProvisioningDetails;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ProjectTag.class})
    private Output</* @Nullable */ List<ProjectTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<ProjectTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Project(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:Project", name, null, makeResourceOptions(options, id));
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
    public static Project get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, options);
    }
}
