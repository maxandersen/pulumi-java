// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.awsnative.quicksight.inputs.DashboardAdHocFilteringOptionArgs;
import com.pulumi.awsnative.quicksight.inputs.DashboardExportToCSVOptionArgs;
import com.pulumi.awsnative.quicksight.inputs.DashboardSheetControlsOptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;Dashboard publish options.&lt;/p&gt;
 * 
 */
public final class DashboardPublishOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardPublishOptionsArgs Empty = new DashboardPublishOptionsArgs();

    @Import(name="adHocFilteringOption")
      private final @Nullable Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption;

    public Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption() {
        return this.adHocFilteringOption == null ? Codegen.empty() : this.adHocFilteringOption;
    }

    @Import(name="exportToCSVOption")
      private final @Nullable Output<DashboardExportToCSVOptionArgs> exportToCSVOption;

    public Output<DashboardExportToCSVOptionArgs> exportToCSVOption() {
        return this.exportToCSVOption == null ? Codegen.empty() : this.exportToCSVOption;
    }

    @Import(name="sheetControlsOption")
      private final @Nullable Output<DashboardSheetControlsOptionArgs> sheetControlsOption;

    public Output<DashboardSheetControlsOptionArgs> sheetControlsOption() {
        return this.sheetControlsOption == null ? Codegen.empty() : this.sheetControlsOption;
    }

    public DashboardPublishOptionsArgs(
        @Nullable Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption,
        @Nullable Output<DashboardExportToCSVOptionArgs> exportToCSVOption,
        @Nullable Output<DashboardSheetControlsOptionArgs> sheetControlsOption) {
        this.adHocFilteringOption = adHocFilteringOption;
        this.exportToCSVOption = exportToCSVOption;
        this.sheetControlsOption = sheetControlsOption;
    }

    private DashboardPublishOptionsArgs() {
        this.adHocFilteringOption = Codegen.empty();
        this.exportToCSVOption = Codegen.empty();
        this.sheetControlsOption = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardPublishOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption;
        private @Nullable Output<DashboardExportToCSVOptionArgs> exportToCSVOption;
        private @Nullable Output<DashboardSheetControlsOptionArgs> sheetControlsOption;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardPublishOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adHocFilteringOption = defaults.adHocFilteringOption;
    	      this.exportToCSVOption = defaults.exportToCSVOption;
    	      this.sheetControlsOption = defaults.sheetControlsOption;
        }

        public Builder adHocFilteringOption(@Nullable Output<DashboardAdHocFilteringOptionArgs> adHocFilteringOption) {
            this.adHocFilteringOption = adHocFilteringOption;
            return this;
        }
        public Builder adHocFilteringOption(@Nullable DashboardAdHocFilteringOptionArgs adHocFilteringOption) {
            this.adHocFilteringOption = Codegen.ofNullable(adHocFilteringOption);
            return this;
        }
        public Builder exportToCSVOption(@Nullable Output<DashboardExportToCSVOptionArgs> exportToCSVOption) {
            this.exportToCSVOption = exportToCSVOption;
            return this;
        }
        public Builder exportToCSVOption(@Nullable DashboardExportToCSVOptionArgs exportToCSVOption) {
            this.exportToCSVOption = Codegen.ofNullable(exportToCSVOption);
            return this;
        }
        public Builder sheetControlsOption(@Nullable Output<DashboardSheetControlsOptionArgs> sheetControlsOption) {
            this.sheetControlsOption = sheetControlsOption;
            return this;
        }
        public Builder sheetControlsOption(@Nullable DashboardSheetControlsOptionArgs sheetControlsOption) {
            this.sheetControlsOption = Codegen.ofNullable(sheetControlsOption);
            return this;
        }        public DashboardPublishOptionsArgs build() {
            return new DashboardPublishOptionsArgs(adHocFilteringOption, exportToCSVOption, sheetControlsOption);
        }
    }
}
