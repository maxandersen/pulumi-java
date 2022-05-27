// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.testbase.PackageArgs;
import com.pulumi.azurenative.testbase.outputs.PackageValidationResultResponse;
import com.pulumi.azurenative.testbase.outputs.SystemDataResponse;
import com.pulumi.azurenative.testbase.outputs.TargetOSInfoResponse;
import com.pulumi.azurenative.testbase.outputs.TestResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Test Base Package resource.
 * API Version: 2020-12-16-preview.
 * 
 * ## Example Usage
 * ### PackageCreate
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var package_ = new Package(&#34;package&#34;, PackageArgs.builder()        
 *             .applicationName(&#34;contoso-package2&#34;)
 *             .blobPath(&#34;storageAccountPath/package.zip&#34;)
 *             .flightingRing(&#34;Insider Beta Channel&#34;)
 *             .location(&#34;westus&#34;)
 *             .packageName(&#34;contoso-package2&#34;)
 *             .resourceGroupName(&#34;contoso-rg1&#34;)
 *             .tags()
 *             .targetOSList(Map.ofEntries(
 *                 Map.entry(&#34;osUpdateType&#34;, &#34;Security updates&#34;),
 *                 Map.entry(&#34;targetOSs&#34;,                 
 *                     &#34;Windows 10 2004&#34;,
 *                     &#34;Windows 10 1903&#34;)
 *             ))
 *             .testBaseAccountName(&#34;contoso-testBaseAccount1&#34;)
 *             .tests(Map.ofEntries(
 *                 Map.entry(&#34;commands&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;action&#34;, &#34;Install&#34;),
 *                         Map.entry(&#34;alwaysRun&#34;, true),
 *                         Map.entry(&#34;applyUpdateBefore&#34;, false),
 *                         Map.entry(&#34;content&#34;, &#34;app/scripts/install/job.ps1&#34;),
 *                         Map.entry(&#34;contentType&#34;, &#34;Path&#34;),
 *                         Map.entry(&#34;maxRunTime&#34;, 1800),
 *                         Map.entry(&#34;name&#34;, &#34;Install&#34;),
 *                         Map.entry(&#34;restartAfter&#34;, true),
 *                         Map.entry(&#34;runAsInteractive&#34;, true),
 *                         Map.entry(&#34;runElevated&#34;, true)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;action&#34;, &#34;Launch&#34;),
 *                         Map.entry(&#34;alwaysRun&#34;, false),
 *                         Map.entry(&#34;applyUpdateBefore&#34;, true),
 *                         Map.entry(&#34;content&#34;, &#34;app/scripts/launch/job.ps1&#34;),
 *                         Map.entry(&#34;contentType&#34;, &#34;Path&#34;),
 *                         Map.entry(&#34;maxRunTime&#34;, 1800),
 *                         Map.entry(&#34;name&#34;, &#34;Launch&#34;),
 *                         Map.entry(&#34;restartAfter&#34;, false),
 *                         Map.entry(&#34;runAsInteractive&#34;, true),
 *                         Map.entry(&#34;runElevated&#34;, true)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;action&#34;, &#34;Close&#34;),
 *                         Map.entry(&#34;alwaysRun&#34;, false),
 *                         Map.entry(&#34;applyUpdateBefore&#34;, false),
 *                         Map.entry(&#34;content&#34;, &#34;app/scripts/close/job.ps1&#34;),
 *                         Map.entry(&#34;contentType&#34;, &#34;Path&#34;),
 *                         Map.entry(&#34;maxRunTime&#34;, 1800),
 *                         Map.entry(&#34;name&#34;, &#34;Close&#34;),
 *                         Map.entry(&#34;restartAfter&#34;, false),
 *                         Map.entry(&#34;runAsInteractive&#34;, true),
 *                         Map.entry(&#34;runElevated&#34;, true)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;action&#34;, &#34;Uninstall&#34;),
 *                         Map.entry(&#34;alwaysRun&#34;, true),
 *                         Map.entry(&#34;applyUpdateBefore&#34;, false),
 *                         Map.entry(&#34;content&#34;, &#34;app/scripts/uninstall/job.ps1&#34;),
 *                         Map.entry(&#34;contentType&#34;, &#34;Path&#34;),
 *                         Map.entry(&#34;maxRunTime&#34;, 1800),
 *                         Map.entry(&#34;name&#34;, &#34;Uninstall&#34;),
 *                         Map.entry(&#34;restartAfter&#34;, false),
 *                         Map.entry(&#34;runAsInteractive&#34;, true),
 *                         Map.entry(&#34;runElevated&#34;, true)
 *                     )),
 *                 Map.entry(&#34;isActive&#34;, true),
 *                 Map.entry(&#34;testType&#34;, &#34;OutOfBoxTest&#34;)
 *             ))
 *             .version(&#34;1.0.0&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:testbase:Package contoso-package2 /subscriptions/476f61a4-952c-422a-b4db-568a828f35df/resourceGroups/contoso-rg1/providers/Microsoft.TestBase/testBaseAccounts/contoso-testBaseAccount1/packages/contoso-package2 
 * ```
 * 
 */
@ResourceType(type="azure-native:testbase:Package")
public class Package extends com.pulumi.resources.CustomResource {
    /**
     * Application name
     * 
     */
    @Export(name="applicationName", type=String.class, parameters={})
    private Output<String> applicationName;

    /**
     * @return Application name
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }
    /**
     * The file path of the package.
     * 
     */
    @Export(name="blobPath", type=String.class, parameters={})
    private Output<String> blobPath;

    /**
     * @return The file path of the package.
     * 
     */
    public Output<String> blobPath() {
        return this.blobPath;
    }
    /**
     * Resource Etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Resource Etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The flighting ring for feature update.
     * 
     */
    @Export(name="flightingRing", type=String.class, parameters={})
    private Output<String> flightingRing;

    /**
     * @return The flighting ring for feature update.
     * 
     */
    public Output<String> flightingRing() {
        return this.flightingRing;
    }
    /**
     * Flag showing that whether the package is enabled. It doesn&#39;t schedule test for package which is not enabled.
     * 
     */
    @Export(name="isEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isEnabled;

    /**
     * @return Flag showing that whether the package is enabled. It doesn&#39;t schedule test for package which is not enabled.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }
    /**
     * The UTC timestamp when the package was last modified.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return The UTC timestamp when the package was last modified.
     * 
     */
    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The status of the package.
     * 
     */
    @Export(name="packageStatus", type=String.class, parameters={})
    private Output<String> packageStatus;

    /**
     * @return The status of the package.
     * 
     */
    public Output<String> packageStatus() {
        return this.packageStatus;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The system metadata relating to this resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the target OSs of specific OS Update types.
     * 
     */
    @Export(name="targetOSList", type=List.class, parameters={TargetOSInfoResponse.class})
    private Output<List<TargetOSInfoResponse>> targetOSList;

    /**
     * @return Specifies the target OSs of specific OS Update types.
     * 
     */
    public Output<List<TargetOSInfoResponse>> targetOSList() {
        return this.targetOSList;
    }
    /**
     * OOB, functional or both. Mapped to the data in &#39;tests&#39; property.
     * 
     */
    @Export(name="testTypes", type=List.class, parameters={String.class})
    private Output<List<String>> testTypes;

    /**
     * @return OOB, functional or both. Mapped to the data in &#39;tests&#39; property.
     * 
     */
    public Output<List<String>> testTypes() {
        return this.testTypes;
    }
    /**
     * The detailed test information.
     * 
     */
    @Export(name="tests", type=List.class, parameters={TestResponse.class})
    private Output<List<TestResponse>> tests;

    /**
     * @return The detailed test information.
     * 
     */
    public Output<List<TestResponse>> tests() {
        return this.tests;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The validation results. There&#39;s validation on package when it&#39;s created or updated.
     * 
     */
    @Export(name="validationResults", type=List.class, parameters={PackageValidationResultResponse.class})
    private Output<List<PackageValidationResultResponse>> validationResults;

    /**
     * @return The validation results. There&#39;s validation on package when it&#39;s created or updated.
     * 
     */
    public Output<List<PackageValidationResultResponse>> validationResults() {
        return this.validationResults;
    }
    /**
     * Application version
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Application version
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Package(String name) {
        this(name, PackageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Package(String name, PackageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Package(String name, PackageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:Package", name, args == null ? PackageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Package(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:Package", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:testbase/v20201216preview:Package").build())
            ))
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
    public static Package get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Package(name, id, options);
    }
}
