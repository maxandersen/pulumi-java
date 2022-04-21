// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.MetadataItemsItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A metadata key/value entry.
 * 
 */
public final class MetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetadataResponse Empty = new MetadataResponse();

    /**
     * Specifies a fingerprint for this request, which is essentially a hash of the metadata&#39;s contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the resource.
     * 
     */
    @Import(name="fingerprint", required=true)
    private String fingerprint;

    public String fingerprint() {
        return this.fingerprint;
    }

    /**
     * Array of key/value pairs. The total size of all keys and values must be less than 512 KB.
     * 
     */
    @Import(name="items", required=true)
    private List<MetadataItemsItemResponse> items;

    public List<MetadataItemsItemResponse> items() {
        return this.items;
    }

    /**
     * Type of the resource. Always compute#metadata for metadata.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    private MetadataResponse() {}

    private MetadataResponse(MetadataResponse $) {
        this.fingerprint = $.fingerprint;
        this.items = $.items;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataResponse $;

        public Builder() {
            $ = new MetadataResponse();
        }

        public Builder(MetadataResponse defaults) {
            $ = new MetadataResponse(Objects.requireNonNull(defaults));
        }

        public Builder fingerprint(String fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        public Builder items(List<MetadataItemsItemResponse> items) {
            $.items = items;
            return this;
        }

        public Builder items(MetadataItemsItemResponse... items) {
            return items(List.of(items));
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public MetadataResponse build() {
            $.fingerprint = Objects.requireNonNull($.fingerprint, "expected parameter 'fingerprint' to be non-null");
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
