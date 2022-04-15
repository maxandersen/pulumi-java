// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTableCardCellArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Row of TableCard.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs();

    /**
     * Optional. List of cells that make up this row.
     * 
     */
    @Import(name="cells")
      private final @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellArgs>> cells;

    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellArgs>> cells() {
        return this.cells == null ? Codegen.empty() : this.cells;
    }

    /**
     * Optional. Whether to add a visual divider after this row.
     * 
     */
    @Import(name="dividerAfter")
      private final @Nullable Output<Boolean> dividerAfter;

    public Output<Boolean> dividerAfter() {
        return this.dividerAfter == null ? Codegen.empty() : this.dividerAfter;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs(
        @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellArgs>> cells,
        @Nullable Output<Boolean> dividerAfter) {
        this.cells = cells;
        this.dividerAfter = dividerAfter;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs() {
        this.cells = Codegen.empty();
        this.dividerAfter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellArgs>> cells;
        private @Nullable Output<Boolean> dividerAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cells = defaults.cells;
    	      this.dividerAfter = defaults.dividerAfter;
        }

        public Builder cells(@Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellArgs>> cells) {
            this.cells = cells;
            return this;
        }
        public Builder cells(@Nullable List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellArgs> cells) {
            this.cells = Codegen.ofNullable(cells);
            return this;
        }
        public Builder cells(GoogleCloudDialogflowV2beta1IntentMessageTableCardCellArgs... cells) {
            return cells(List.of(cells));
        }
        public Builder dividerAfter(@Nullable Output<Boolean> dividerAfter) {
            this.dividerAfter = dividerAfter;
            return this;
        }
        public Builder dividerAfter(@Nullable Boolean dividerAfter) {
            this.dividerAfter = Codegen.ofNullable(dividerAfter);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs(cells, dividerAfter);
        }
    }
}
