// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Instruction from a PDF file.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1PdfInstructionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1PdfInstructionResponse Empty = new GoogleCloudDatalabelingV1beta1PdfInstructionResponse();

    /**
     * PDF file for the instruction. Only gcs path is allowed.
     * 
     */
    @Import(name="gcsFileUri", required=true)
    private String gcsFileUri;

    public String gcsFileUri() {
        return this.gcsFileUri;
    }

    private GoogleCloudDatalabelingV1beta1PdfInstructionResponse() {}

    private GoogleCloudDatalabelingV1beta1PdfInstructionResponse(GoogleCloudDatalabelingV1beta1PdfInstructionResponse $) {
        this.gcsFileUri = $.gcsFileUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatalabelingV1beta1PdfInstructionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatalabelingV1beta1PdfInstructionResponse $;

        public Builder() {
            $ = new GoogleCloudDatalabelingV1beta1PdfInstructionResponse();
        }

        public Builder(GoogleCloudDatalabelingV1beta1PdfInstructionResponse defaults) {
            $ = new GoogleCloudDatalabelingV1beta1PdfInstructionResponse(Objects.requireNonNull(defaults));
        }

        public Builder gcsFileUri(String gcsFileUri) {
            $.gcsFileUri = gcsFileUri;
            return this;
        }

        public GoogleCloudDatalabelingV1beta1PdfInstructionResponse build() {
            $.gcsFileUri = Objects.requireNonNull($.gcsFileUri, "expected parameter 'gcsFileUri' to be non-null");
            return $;
        }
    }

}
