// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow_v2.DocumentArgs;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2DocumentReloadStatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new document. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: KnowledgeOperationMetadata - `response`: Document
 * 
 */
@ResourceType(type="google-native:dialogflow/v2:Document")
public class Document extends com.pulumi.resources.CustomResource {
    /**
     * The URI where the file content is located. For documents stored in Google Cloud Storage, these URIs must have the form `gs:///`. NOTE: External URLs must correspond to public webpages, i.e., they must be indexed by Google Search. In particular, URLs for showing documents in Google Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format URI described above.
     * 
     */
    @Export(name="contentUri", type=String.class, parameters={})
    private Output<String> contentUri;

    /**
     * @return The URI where the file content is located. For documents stored in Google Cloud Storage, these URIs must have the form `gs:///`. NOTE: External URLs must correspond to public webpages, i.e., they must be indexed by Google Search. In particular, URLs for showing documents in Google Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format URI described above.
     * 
     */
    public Output<String> contentUri() {
        return this.contentUri;
    }
    /**
     * The display name of the document. The name must be 1024 bytes or less; otherwise, the creation request fails.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the document. The name must be 1024 bytes or less; otherwise, the creation request fails.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Optional. If true, we try to automatically reload the document every day (at a time picked by the system). If false or unspecified, we don&#39;t try to automatically reload the document. Currently you can only enable automatic reload for documents sourced from a public url, see `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If a reload fails, we will keep the document unchanged. If a reload fails with internal errors, the system will try to reload the document on the next day. If a reload fails with non-retriable errors (e.g. PERMISION_DENIED), the system will not try to reload the document anymore. You need to manually reload the document successfully by calling `ReloadDocument` and clear the errors.
     * 
     */
    @Export(name="enableAutoReload", type=Boolean.class, parameters={})
    private Output<Boolean> enableAutoReload;

    /**
     * @return Optional. If true, we try to automatically reload the document every day (at a time picked by the system). If false or unspecified, we don&#39;t try to automatically reload the document. Currently you can only enable automatic reload for documents sourced from a public url, see `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If a reload fails, we will keep the document unchanged. If a reload fails with internal errors, the system will try to reload the document on the next day. If a reload fails with non-retriable errors (e.g. PERMISION_DENIED), the system will not try to reload the document anymore. You need to manually reload the document successfully by calling `ReloadDocument` and clear the errors.
     * 
     */
    public Output<Boolean> enableAutoReload() {
        return this.enableAutoReload;
    }
    /**
     * The knowledge type of document content.
     * 
     */
    @Export(name="knowledgeTypes", type=List.class, parameters={String.class})
    private Output<List<String>> knowledgeTypes;

    /**
     * @return The knowledge type of document content.
     * 
     */
    public Output<List<String>> knowledgeTypes() {
        return this.knowledgeTypes;
    }
    /**
     * The time and status of the latest reload. This reload may have been triggered automatically or manually and may not have succeeded.
     * 
     */
    @Export(name="latestReloadStatus", type=GoogleCloudDialogflowV2DocumentReloadStatusResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2DocumentReloadStatusResponse> latestReloadStatus;

    /**
     * @return The time and status of the latest reload. This reload may have been triggered automatically or manually and may not have succeeded.
     * 
     */
    public Output<GoogleCloudDialogflowV2DocumentReloadStatusResponse> latestReloadStatus() {
        return this.latestReloadStatus;
    }
    /**
     * Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested use cases include storing a document&#39;s title, an external URL distinct from the document&#39;s content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested use cases include storing a document&#39;s title, an external URL distinct from the document&#39;s content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
     * 
     */
    public Output<Map<String,String>> metadata() {
        return this.metadata;
    }
    /**
     * The MIME type of this document.
     * 
     */
    @Export(name="mimeType", type=String.class, parameters={})
    private Output<String> mimeType;

    /**
     * @return The MIME type of this document.
     * 
     */
    public Output<String> mimeType() {
        return this.mimeType;
    }
    /**
     * Optional. The document resource name. The name must be empty when creating a document. Format: `projects//locations//knowledgeBases//documents/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optional. The document resource name. The name must be empty when creating a document. Format: `projects//locations//knowledgeBases//documents/`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types.
     * 
     */
    @Export(name="rawContent", type=String.class, parameters={})
    private Output<String> rawContent;

    /**
     * @return The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types.
     * 
     */
    public Output<String> rawContent() {
        return this.rawContent;
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
        super("google-native:dialogflow/v2:Document", name, args == null ? DocumentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Document(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Document", name, null, makeResourceOptions(options, id));
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
    public static Document get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Document(name, id, options);
    }
}
