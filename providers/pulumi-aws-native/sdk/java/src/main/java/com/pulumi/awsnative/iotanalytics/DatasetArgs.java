// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics;

import com.pulumi.awsnative.iotanalytics.inputs.DatasetActionArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatasetContentDeliveryRuleArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatasetLateDataRuleArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatasetRetentionPeriodArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatasetTagArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatasetTriggerArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatasetVersioningConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetArgs Empty = new DatasetArgs();

    @Import(name="actions", required=true)
    private Output<List<DatasetActionArgs>> actions;

    public Output<List<DatasetActionArgs>> actions() {
        return this.actions;
    }

    @Import(name="contentDeliveryRules")
    private @Nullable Output<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules;

    public Optional<Output<List<DatasetContentDeliveryRuleArgs>>> contentDeliveryRules() {
        return Optional.ofNullable(this.contentDeliveryRules);
    }

    @Import(name="datasetName")
    private @Nullable Output<String> datasetName;

    public Optional<Output<String>> datasetName() {
        return Optional.ofNullable(this.datasetName);
    }

    @Import(name="lateDataRules")
    private @Nullable Output<List<DatasetLateDataRuleArgs>> lateDataRules;

    public Optional<Output<List<DatasetLateDataRuleArgs>>> lateDataRules() {
        return Optional.ofNullable(this.lateDataRules);
    }

    @Import(name="retentionPeriod")
    private @Nullable Output<DatasetRetentionPeriodArgs> retentionPeriod;

    public Optional<Output<DatasetRetentionPeriodArgs>> retentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }

    @Import(name="tags")
    private @Nullable Output<List<DatasetTagArgs>> tags;

    public Optional<Output<List<DatasetTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="triggers")
    private @Nullable Output<List<DatasetTriggerArgs>> triggers;

    public Optional<Output<List<DatasetTriggerArgs>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    @Import(name="versioningConfiguration")
    private @Nullable Output<DatasetVersioningConfigurationArgs> versioningConfiguration;

    public Optional<Output<DatasetVersioningConfigurationArgs>> versioningConfiguration() {
        return Optional.ofNullable(this.versioningConfiguration);
    }

    private DatasetArgs() {}

    private DatasetArgs(DatasetArgs $) {
        this.actions = $.actions;
        this.contentDeliveryRules = $.contentDeliveryRules;
        this.datasetName = $.datasetName;
        this.lateDataRules = $.lateDataRules;
        this.retentionPeriod = $.retentionPeriod;
        this.tags = $.tags;
        this.triggers = $.triggers;
        this.versioningConfiguration = $.versioningConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetArgs $;

        public Builder() {
            $ = new DatasetArgs();
        }

        public Builder(DatasetArgs defaults) {
            $ = new DatasetArgs(Objects.requireNonNull(defaults));
        }

        public Builder actions(Output<List<DatasetActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(List<DatasetActionArgs> actions) {
            return actions(Output.of(actions));
        }

        public Builder actions(DatasetActionArgs... actions) {
            return actions(List.of(actions));
        }

        public Builder contentDeliveryRules(@Nullable Output<List<DatasetContentDeliveryRuleArgs>> contentDeliveryRules) {
            $.contentDeliveryRules = contentDeliveryRules;
            return this;
        }

        public Builder contentDeliveryRules(List<DatasetContentDeliveryRuleArgs> contentDeliveryRules) {
            return contentDeliveryRules(Output.of(contentDeliveryRules));
        }

        public Builder contentDeliveryRules(DatasetContentDeliveryRuleArgs... contentDeliveryRules) {
            return contentDeliveryRules(List.of(contentDeliveryRules));
        }

        public Builder datasetName(@Nullable Output<String> datasetName) {
            $.datasetName = datasetName;
            return this;
        }

        public Builder datasetName(String datasetName) {
            return datasetName(Output.of(datasetName));
        }

        public Builder lateDataRules(@Nullable Output<List<DatasetLateDataRuleArgs>> lateDataRules) {
            $.lateDataRules = lateDataRules;
            return this;
        }

        public Builder lateDataRules(List<DatasetLateDataRuleArgs> lateDataRules) {
            return lateDataRules(Output.of(lateDataRules));
        }

        public Builder lateDataRules(DatasetLateDataRuleArgs... lateDataRules) {
            return lateDataRules(List.of(lateDataRules));
        }

        public Builder retentionPeriod(@Nullable Output<DatasetRetentionPeriodArgs> retentionPeriod) {
            $.retentionPeriod = retentionPeriod;
            return this;
        }

        public Builder retentionPeriod(DatasetRetentionPeriodArgs retentionPeriod) {
            return retentionPeriod(Output.of(retentionPeriod));
        }

        public Builder tags(@Nullable Output<List<DatasetTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<DatasetTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(DatasetTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder triggers(@Nullable Output<List<DatasetTriggerArgs>> triggers) {
            $.triggers = triggers;
            return this;
        }

        public Builder triggers(List<DatasetTriggerArgs> triggers) {
            return triggers(Output.of(triggers));
        }

        public Builder triggers(DatasetTriggerArgs... triggers) {
            return triggers(List.of(triggers));
        }

        public Builder versioningConfiguration(@Nullable Output<DatasetVersioningConfigurationArgs> versioningConfiguration) {
            $.versioningConfiguration = versioningConfiguration;
            return this;
        }

        public Builder versioningConfiguration(DatasetVersioningConfigurationArgs versioningConfiguration) {
            return versioningConfiguration(Output.of(versioningConfiguration));
        }

        public DatasetArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            return $;
        }
    }

}
