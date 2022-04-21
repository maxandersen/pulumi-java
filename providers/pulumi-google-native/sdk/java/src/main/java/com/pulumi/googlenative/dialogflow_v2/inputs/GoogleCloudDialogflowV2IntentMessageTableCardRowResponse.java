// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageTableCardCellResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


/**
 * Row of TableCard.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageTableCardRowResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageTableCardRowResponse Empty = new GoogleCloudDialogflowV2IntentMessageTableCardRowResponse();

    /**
     * Optional. List of cells that make up this row.
     * 
     */
    @Import(name="cells", required=true)
    private List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells;

    public List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells() {
        return this.cells;
    }

    /**
     * Optional. Whether to add a visual divider after this row.
     * 
     */
    @Import(name="dividerAfter", required=true)
    private Boolean dividerAfter;

    public Boolean dividerAfter() {
        return this.dividerAfter;
    }

    private GoogleCloudDialogflowV2IntentMessageTableCardRowResponse() {}

    private GoogleCloudDialogflowV2IntentMessageTableCardRowResponse(GoogleCloudDialogflowV2IntentMessageTableCardRowResponse $) {
        this.cells = $.cells;
        this.dividerAfter = $.dividerAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTableCardRowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageTableCardRowResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageTableCardRowResponse();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTableCardRowResponse defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageTableCardRowResponse(Objects.requireNonNull(defaults));
        }

        public Builder cells(List<GoogleCloudDialogflowV2IntentMessageTableCardCellResponse> cells) {
            $.cells = cells;
            return this;
        }

        public Builder cells(GoogleCloudDialogflowV2IntentMessageTableCardCellResponse... cells) {
            return cells(List.of(cells));
        }

        public Builder dividerAfter(Boolean dividerAfter) {
            $.dividerAfter = dividerAfter;
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageTableCardRowResponse build() {
            $.cells = Objects.requireNonNull($.cells, "expected parameter 'cells' to be non-null");
            $.dividerAfter = Objects.requireNonNull($.dividerAfter, "expected parameter 'dividerAfter' to be non-null");
            return $;
        }
    }

}
