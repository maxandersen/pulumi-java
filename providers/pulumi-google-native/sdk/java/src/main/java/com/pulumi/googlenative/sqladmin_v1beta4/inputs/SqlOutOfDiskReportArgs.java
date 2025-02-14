// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.SqlOutOfDiskReportSqlOutOfDiskState;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This message wraps up the information written by out-of-disk detection job.
 * 
 */
public final class SqlOutOfDiskReportArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlOutOfDiskReportArgs Empty = new SqlOutOfDiskReportArgs();

    /**
     * The minimum recommended increase size in GigaBytes This field is consumed by the frontend * Writers: * the proactive database wellness job for OOD. * Readers:
     * 
     */
    @Import(name="sqlMinRecommendedIncreaseSizeGb")
    private @Nullable Output<Integer> sqlMinRecommendedIncreaseSizeGb;

    /**
     * @return The minimum recommended increase size in GigaBytes This field is consumed by the frontend * Writers: * the proactive database wellness job for OOD. * Readers:
     * 
     */
    public Optional<Output<Integer>> sqlMinRecommendedIncreaseSizeGb() {
        return Optional.ofNullable(this.sqlMinRecommendedIncreaseSizeGb);
    }

    /**
     * This field represents the state generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    @Import(name="sqlOutOfDiskState")
    private @Nullable Output<SqlOutOfDiskReportSqlOutOfDiskState> sqlOutOfDiskState;

    /**
     * @return This field represents the state generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    public Optional<Output<SqlOutOfDiskReportSqlOutOfDiskState>> sqlOutOfDiskState() {
        return Optional.ofNullable(this.sqlOutOfDiskState);
    }

    private SqlOutOfDiskReportArgs() {}

    private SqlOutOfDiskReportArgs(SqlOutOfDiskReportArgs $) {
        this.sqlMinRecommendedIncreaseSizeGb = $.sqlMinRecommendedIncreaseSizeGb;
        this.sqlOutOfDiskState = $.sqlOutOfDiskState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlOutOfDiskReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlOutOfDiskReportArgs $;

        public Builder() {
            $ = new SqlOutOfDiskReportArgs();
        }

        public Builder(SqlOutOfDiskReportArgs defaults) {
            $ = new SqlOutOfDiskReportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param sqlMinRecommendedIncreaseSizeGb The minimum recommended increase size in GigaBytes This field is consumed by the frontend * Writers: * the proactive database wellness job for OOD. * Readers:
         * 
         * @return builder
         * 
         */
        public Builder sqlMinRecommendedIncreaseSizeGb(@Nullable Output<Integer> sqlMinRecommendedIncreaseSizeGb) {
            $.sqlMinRecommendedIncreaseSizeGb = sqlMinRecommendedIncreaseSizeGb;
            return this;
        }

        /**
         * @param sqlMinRecommendedIncreaseSizeGb The minimum recommended increase size in GigaBytes This field is consumed by the frontend * Writers: * the proactive database wellness job for OOD. * Readers:
         * 
         * @return builder
         * 
         */
        public Builder sqlMinRecommendedIncreaseSizeGb(Integer sqlMinRecommendedIncreaseSizeGb) {
            return sqlMinRecommendedIncreaseSizeGb(Output.of(sqlMinRecommendedIncreaseSizeGb));
        }

        /**
         * @param sqlOutOfDiskState This field represents the state generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
         * 
         * @return builder
         * 
         */
        public Builder sqlOutOfDiskState(@Nullable Output<SqlOutOfDiskReportSqlOutOfDiskState> sqlOutOfDiskState) {
            $.sqlOutOfDiskState = sqlOutOfDiskState;
            return this;
        }

        /**
         * @param sqlOutOfDiskState This field represents the state generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
         * 
         * @return builder
         * 
         */
        public Builder sqlOutOfDiskState(SqlOutOfDiskReportSqlOutOfDiskState sqlOutOfDiskState) {
            return sqlOutOfDiskState(Output.of(sqlOutOfDiskState));
        }

        public SqlOutOfDiskReportArgs build() {
            return $;
        }
    }

}
