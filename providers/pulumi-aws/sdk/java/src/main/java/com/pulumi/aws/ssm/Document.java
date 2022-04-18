// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.DocumentArgs;
import com.pulumi.aws.ssm.inputs.DocumentState;
import com.pulumi.aws.ssm.outputs.DocumentAttachmentsSource;
import com.pulumi.aws.ssm.outputs.DocumentParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an SSM Document resource
 * 
 * > **NOTE on updating SSM documents:** Only documents with a schema version of 2.0
 * or greater can update their content once created, see [SSM Schema Features](http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html#document-schemas-features). To update a document with an older schema version you must recreate the resource. Not all document types support a schema version of 2.0 or greater. Refer to [SSM document schema features and examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html) for information about which schema versions are supported for the respective `document_type`.
 * 
 * ## Example Usage
 * ## Permissions
 * 
 * The permissions attribute specifies how you want to share the document. If you share a document privately,
 * you must specify the AWS user account IDs for those people who can use the document. If you share a document
 * publicly, you must specify All as the account ID.
 * 
 * The permissions mapping supports the following:
 * 
 * * `type` - The permission type for the document. The permission type can be `Share`.
 * * `account_ids` - The AWS user accounts that should have access to the document. The account IDs can either be a group of account IDs or `All`.
 * 
 * ## Import
 * 
 * SSM Documents can be imported using the name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssm/document:Document example example
 * ```
 * 
 *  The `attachments_source` argument does not have an SSM API method for reading the attachment information detail after creation. If the argument is set in the provider configuration on an imported resource, this provider will always show a difference. To workaround this behavior, either omit the argument from the configuration or use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to hide the difference, e.g. terraform resource "aws_ssm_document" "test" {
 * 
 *  name
 * 
 * = "test_document"
 * 
 *  document_type = "Package"
 * 
 *  attachments_source {
 * 
 *  key
 * 
 * = "SourceUrl"
 * 
 *  values = ["s3://${aws_s3_bucket.object_bucket.bucket}/test.zip"]
 * 
 *  }
 * 
 * # There is no AWS SSM API for reading attachments_source info directly
 * 
 *  lifecycle {
 * 
 *  ignore_changes = [attachments_source]
 * 
 *  } }
 * 
 */
@ResourceType(type="aws:ssm/document:Document")
public class Document extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
     * 
     */
    @Export(name="attachmentsSources", type=List.class, parameters={DocumentAttachmentsSource.class})
    private Output</* @Nullable */ List<DocumentAttachmentsSource>> attachmentsSources;

    /**
     * @return One or more configuration blocks describing attachments sources to a version of a document. Defined below.
     * 
     */
    public Output</* @Nullable */ List<DocumentAttachmentsSource>> attachmentsSources() {
        return this.attachmentsSources;
    }
    /**
     * The JSON or YAML content of the document.
     * 
     */
    @Export(name="content", type=String.class, parameters={})
    private Output<String> content;

    /**
     * @return The JSON or YAML content of the document.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * The date the document was created.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The date the document was created.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * The default version of the document.
     * 
     */
    @Export(name="defaultVersion", type=String.class, parameters={})
    private Output<String> defaultVersion;

    /**
     * @return The default version of the document.
     * 
     */
    public Output<String> defaultVersion() {
        return this.defaultVersion;
    }
    /**
     * The description of the document.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the document.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The format of the document. Valid document types include: `JSON` and `YAML`
     * 
     */
    @Export(name="documentFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> documentFormat;

    /**
     * @return The format of the document. Valid document types include: `JSON` and `YAML`
     * 
     */
    public Output</* @Nullable */ String> documentFormat() {
        return this.documentFormat;
    }
    /**
     * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
     * 
     */
    @Export(name="documentType", type=String.class, parameters={})
    private Output<String> documentType;

    /**
     * @return The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
     * 
     */
    public Output<String> documentType() {
        return this.documentType;
    }
    /**
     * The document version.
     * 
     */
    @Export(name="documentVersion", type=String.class, parameters={})
    private Output<String> documentVersion;

    /**
     * @return The document version.
     * 
     */
    public Output<String> documentVersion() {
        return this.documentVersion;
    }
    /**
     * The sha1 or sha256 of the document content
     * 
     */
    @Export(name="hash", type=String.class, parameters={})
    private Output<String> hash;

    /**
     * @return The sha1 or sha256 of the document content
     * 
     */
    public Output<String> hash() {
        return this.hash;
    }
    /**
     * "Sha1" "Sha256". The hashing algorithm used when hashing the content.
     * 
     */
    @Export(name="hashType", type=String.class, parameters={})
    private Output<String> hashType;

    /**
     * @return "Sha1" "Sha256". The hashing algorithm used when hashing the content.
     * 
     */
    public Output<String> hashType() {
        return this.hashType;
    }
    /**
     * The latest version of the document.
     * 
     */
    @Export(name="latestVersion", type=String.class, parameters={})
    private Output<String> latestVersion;

    /**
     * @return The latest version of the document.
     * 
     */
    public Output<String> latestVersion() {
        return this.latestVersion;
    }
    /**
     * The name of the document.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the document.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The AWS user account of the person who created the document.
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return The AWS user account of the person who created the document.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The parameters that are available to this document.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={DocumentParameter.class})
    private Output<List<DocumentParameter>> parameters;

    /**
     * @return The parameters that are available to this document.
     * 
     */
    public Output<List<DocumentParameter>> parameters() {
        return this.parameters;
    }
    /**
     * Additional Permissions to attach to the document. See Permissions below for details.
     * 
     */
    @Export(name="permissions", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> permissions;

    /**
     * @return Additional Permissions to attach to the document. See Permissions below for details.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> permissions() {
        return this.permissions;
    }
    /**
     * A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
     * 
     */
    @Export(name="platformTypes", type=List.class, parameters={String.class})
    private Output<List<String>> platformTypes;

    /**
     * @return A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
     * 
     */
    public Output<List<String>> platformTypes() {
        return this.platformTypes;
    }
    /**
     * The schema version of the document.
     * 
     */
    @Export(name="schemaVersion", type=String.class, parameters={})
    private Output<String> schemaVersion;

    /**
     * @return The schema version of the document.
     * 
     */
    public Output<String> schemaVersion() {
        return this.schemaVersion;
    }
    /**
     * "Creating", "Active" or "Deleting". The current status of the document.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return "Creating", "Active" or "Deleting". The current status of the document.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * 
     */
    @Export(name="targetType", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetType;

    /**
     * @return The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
     * 
     */
    public Output</* @Nullable */ String> targetType() {
        return this.targetType;
    }
    /**
     * A field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document and cannot be changed for an existing document version.
     * 
     */
    @Export(name="versionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> versionName;

    /**
     * @return A field specifying the version of the artifact you are creating with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document and cannot be changed for an existing document version.
     * 
     */
    public Output</* @Nullable */ String> versionName() {
        return this.versionName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Document(String name) {
        this(name, DocumentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Document(String name, DocumentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Document(String name, DocumentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/document:Document", name, args == null ? DocumentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Document(String name, Output<String> id, @Nullable DocumentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/document:Document", name, state, makeResourceOptions(options, id));
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
    public static Document get(String name, Output<String> id, @Nullable DocumentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Document(name, id, state, options);
    }
}
