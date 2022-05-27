// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.ShareFileArgs;
import com.pulumi.azure.storage.inputs.ShareFileState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a File within an Azure Storage File Share.
 * 
 * ## Example Usage
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleShare = new Share(&#34;exampleShare&#34;, ShareArgs.builder()        
 *             .storageAccountName(exampleAccount.getName())
 *             .quota(50)
 *             .build());
 * 
 *         var exampleShareFile = new ShareFile(&#34;exampleShareFile&#34;, ShareFileArgs.builder()        
 *             .storageShareId(exampleShare.getId())
 *             .source(&#34;some-local-file.zip&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Directories within an Azure Storage File Share can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:storage/shareFile:ShareFile example https://account1.file.core.windows.net/share1/file1
 * ```
 * 
 */
@ResourceType(type="azure:storage/shareFile:ShareFile")
public class ShareFile extends com.pulumi.resources.CustomResource {
    /**
     * Sets the file’s Content-Disposition header.
     * 
     */
    @Export(name="contentDisposition", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentDisposition;

    /**
     * @return Sets the file’s Content-Disposition header.
     * 
     */
    public Output<Optional<String>> contentDisposition() {
        return Codegen.optional(this.contentDisposition);
    }
    /**
     * Specifies which content encodings have been applied to the file.
     * 
     */
    @Export(name="contentEncoding", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentEncoding;

    /**
     * @return Specifies which content encodings have been applied to the file.
     * 
     */
    public Output<Optional<String>> contentEncoding() {
        return Codegen.optional(this.contentEncoding);
    }
    /**
     * The length in bytes of the file content
     * 
     */
    @Export(name="contentLength", type=Integer.class, parameters={})
    private Output<Integer> contentLength;

    /**
     * @return The length in bytes of the file content
     * 
     */
    public Output<Integer> contentLength() {
        return this.contentLength;
    }
    /**
     * The MD5 sum of the file contents. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="contentMd5", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentMd5;

    /**
     * @return The MD5 sum of the file contents. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> contentMd5() {
        return Codegen.optional(this.contentMd5);
    }
    /**
     * The content type of the share file. Defaults to `application/octet-stream`.
     * 
     */
    @Export(name="contentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentType;

    /**
     * @return The content type of the share file. Defaults to `application/octet-stream`.
     * 
     */
    public Output<Optional<String>> contentType() {
        return Codegen.optional(this.contentType);
    }
    /**
     * A mapping of metadata to assign to this file.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return A mapping of metadata to assign to this file.
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name (or path) of the File that should be created within this File Share. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output</* @Nullable */ String> path;

    /**
     * @return The storage share directory that you would like the file placed into. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> path() {
        return Codegen.optional(this.path);
    }
    /**
     * An absolute path to a file on the local system.
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    /**
     * @return An absolute path to a file on the local system.
     * 
     */
    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageShareId", type=String.class, parameters={})
    private Output<String> storageShareId;

    /**
     * @return The Storage Share ID in which this file will be placed into. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageShareId() {
        return this.storageShareId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ShareFile(String name) {
        this(name, ShareFileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ShareFile(String name, ShareFileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ShareFile(String name, ShareFileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/shareFile:ShareFile", name, args == null ? ShareFileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ShareFile(String name, Output<String> id, @Nullable ShareFileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/shareFile:ShareFile", name, state, makeResourceOptions(options, id));
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
    public static ShareFile get(String name, Output<String> id, @Nullable ShareFileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ShareFile(name, id, state, options);
    }
}
