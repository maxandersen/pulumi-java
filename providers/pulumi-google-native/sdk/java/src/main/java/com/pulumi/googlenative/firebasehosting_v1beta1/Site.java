// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.firebasehosting_v1beta1.SiteArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Hosting Site in the specified parent Firebase project. Note that Hosting sites can take several minutes to propagate through Firebase systems.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:firebasehosting/v1beta1:Site")
public class Site extends com.pulumi.resources.CustomResource {
    /**
     * Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id) associated with the Hosting site.
     * 
     */
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id) associated with the Hosting site.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The default URL for the Hosting site.
     * 
     */
    @Export(name="defaultUrl", type=String.class, parameters={})
    private Output<String> defaultUrl;

    /**
     * @return The default URL for the Hosting site.
     * 
     */
    public Output<String> defaultUrl() {
        return this.defaultUrl;
    }
    /**
     * Optional. User-specified labels for the Hosting site.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. User-specified labels for the Hosting site.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The fully-qualified resource name of the Hosting site, in the format: projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the Firebase project&#39;s [`ProjectNumber`](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google&#39;s [AIP 2510 standard](https://google.aip.dev/cloud/2510).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The fully-qualified resource name of the Hosting site, in the format: projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the Firebase project&#39;s [`ProjectNumber`](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google&#39;s [AIP 2510 standard](https://google.aip.dev/cloud/2510).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of Hosting site. Every Firebase project has a `DEFAULT_SITE`, which is created when Hosting is provisioned for the project. All additional sites are `USER_SITE`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Hosting site. Every Firebase project has a `DEFAULT_SITE`, which is created when Hosting is provisioned for the project. All additional sites are `USER_SITE`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Site(String name) {
        this(name, SiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Site(String name, SiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Site(String name, SiteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebasehosting/v1beta1:Site", name, args == null ? SiteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Site(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebasehosting/v1beta1:Site", name, null, makeResourceOptions(options, id));
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
    public static Site get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Site(name, id, options);
    }
}
