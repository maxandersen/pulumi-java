// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.inputs.BiEngineStatisticsResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.BigQueryModelTrainingResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.DatasetReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.DmlStatisticsResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.ExplainQueryStageResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.JobStatistics2ReservationUsageItemResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.MlStatisticsResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.QueryParameterResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.QueryTimelineSampleResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.RoutineReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.RowAccessPolicyReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.TableReferenceResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.TableSchemaResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class JobStatistics2Response extends com.pulumi.resources.InvokeArgs {

    public static final JobStatistics2Response Empty = new JobStatistics2Response();

    /**
     * BI Engine specific Statistics. [Output-only] BI Engine specific Statistics.
     * 
     */
    @Import(name="biEngineStatistics", required=true)
      private final BiEngineStatisticsResponse biEngineStatistics;

    public BiEngineStatisticsResponse biEngineStatistics() {
        return this.biEngineStatistics;
    }

    /**
     * Billing tier for the job.
     * 
     */
    @Import(name="billingTier", required=true)
      private final Integer billingTier;

    public Integer billingTier() {
        return this.billingTier;
    }

    /**
     * Whether the query result was fetched from the query cache.
     * 
     */
    @Import(name="cacheHit", required=true)
      private final Boolean cacheHit;

    public Boolean cacheHit() {
        return this.cacheHit;
    }

    /**
     * [Preview] The number of row access policies affected by a DDL statement. Present only for DROP ALL ROW ACCESS POLICIES queries.
     * 
     */
    @Import(name="ddlAffectedRowAccessPolicyCount", required=true)
      private final String ddlAffectedRowAccessPolicyCount;

    public String ddlAffectedRowAccessPolicyCount() {
        return this.ddlAffectedRowAccessPolicyCount;
    }

    /**
     * The DDL destination table. Present only for ALTER TABLE RENAME TO queries. Note that ddl_target_table is used just for its type information.
     * 
     */
    @Import(name="ddlDestinationTable", required=true)
      private final TableReferenceResponse ddlDestinationTable;

    public TableReferenceResponse ddlDestinationTable() {
        return this.ddlDestinationTable;
    }

    /**
     * The DDL operation performed, possibly dependent on the pre-existence of the DDL target. Possible values (new values might be added in the future): "CREATE": The query created the DDL target. "SKIP": No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table already exists, or the query is DROP TABLE IF EXISTS while the table does not exist. "REPLACE": The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the table already exists. "DROP": The query deleted the DDL target.
     * 
     */
    @Import(name="ddlOperationPerformed", required=true)
      private final String ddlOperationPerformed;

    public String ddlOperationPerformed() {
        return this.ddlOperationPerformed;
    }

    /**
     * The DDL target dataset. Present only for CREATE/ALTER/DROP SCHEMA queries.
     * 
     */
    @Import(name="ddlTargetDataset", required=true)
      private final DatasetReferenceResponse ddlTargetDataset;

    public DatasetReferenceResponse ddlTargetDataset() {
        return this.ddlTargetDataset;
    }

    /**
     * The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE queries.
     * 
     */
    @Import(name="ddlTargetRoutine", required=true)
      private final RoutineReferenceResponse ddlTargetRoutine;

    public RoutineReferenceResponse ddlTargetRoutine() {
        return this.ddlTargetRoutine;
    }

    /**
     * [Preview] The DDL target row access policy. Present only for CREATE/DROP ROW ACCESS POLICY queries.
     * 
     */
    @Import(name="ddlTargetRowAccessPolicy", required=true)
      private final RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy;

    public RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy() {
        return this.ddlTargetRowAccessPolicy;
    }

    /**
     * The DDL target table. Present only for CREATE/DROP TABLE/VIEW and DROP ALL ROW ACCESS POLICIES queries.
     * 
     */
    @Import(name="ddlTargetTable", required=true)
      private final TableReferenceResponse ddlTargetTable;

    public TableReferenceResponse ddlTargetTable() {
        return this.ddlTargetTable;
    }

    /**
     * Detailed statistics for DML statements Present only for DML statements INSERT, UPDATE, DELETE or TRUNCATE.
     * 
     */
    @Import(name="dmlStats", required=true)
      private final DmlStatisticsResponse dmlStats;

    public DmlStatisticsResponse dmlStats() {
        return this.dmlStats;
    }

    /**
     * The original estimate of bytes processed for the job.
     * 
     */
    @Import(name="estimatedBytesProcessed", required=true)
      private final String estimatedBytesProcessed;

    public String estimatedBytesProcessed() {
        return this.estimatedBytesProcessed;
    }

    /**
     * Statistics of a BigQuery ML training job.
     * 
     */
    @Import(name="mlStatistics", required=true)
      private final MlStatisticsResponse mlStatistics;

    public MlStatisticsResponse mlStatistics() {
        return this.mlStatistics;
    }

    /**
     * [Output-only, Beta] Information about create model query job progress.
     * 
     */
    @Import(name="modelTraining", required=true)
      private final BigQueryModelTrainingResponse modelTraining;

    public BigQueryModelTrainingResponse modelTraining() {
        return this.modelTraining;
    }

    /**
     * The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.
     * 
     */
    @Import(name="numDmlAffectedRows", required=true)
      private final String numDmlAffectedRows;

    public String numDmlAffectedRows() {
        return this.numDmlAffectedRows;
    }

    /**
     * Describes execution plan for the query.
     * 
     */
    @Import(name="queryPlan", required=true)
      private final List<ExplainQueryStageResponse> queryPlan;

    public List<ExplainQueryStageResponse> queryPlan() {
        return this.queryPlan;
    }

    /**
     * Referenced routines (persistent user-defined functions and stored procedures) for the job.
     * 
     */
    @Import(name="referencedRoutines", required=true)
      private final List<RoutineReferenceResponse> referencedRoutines;

    public List<RoutineReferenceResponse> referencedRoutines() {
        return this.referencedRoutines;
    }

    /**
     * Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list.
     * 
     */
    @Import(name="referencedTables", required=true)
      private final List<TableReferenceResponse> referencedTables;

    public List<TableReferenceResponse> referencedTables() {
        return this.referencedTables;
    }

    /**
     * Job resource usage breakdown by reservation.
     * 
     */
    @Import(name="reservationUsage", required=true)
      private final List<JobStatistics2ReservationUsageItemResponse> reservationUsage;

    public List<JobStatistics2ReservationUsageItemResponse> reservationUsage() {
        return this.reservationUsage;
    }

    /**
     * The schema of the results. Present only for successful dry run of non-legacy SQL queries.
     * 
     */
    @Import(name="schema", required=true)
      private final TableSchemaResponse schema;

    public TableSchemaResponse schema() {
        return this.schema;
    }

    /**
     * The type of query statement, if valid. Possible values (new values might be added in the future): "SELECT": SELECT query. "INSERT": INSERT query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "UPDATE": UPDATE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "DELETE": DELETE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "MERGE": MERGE query; see https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "ALTER_TABLE": ALTER TABLE query. "ALTER_VIEW": ALTER VIEW query. "ASSERT": ASSERT condition AS 'description'. "CREATE_FUNCTION": CREATE FUNCTION query. "CREATE_MODEL": CREATE [OR REPLACE] MODEL ... AS SELECT ... . "CREATE_PROCEDURE": CREATE PROCEDURE query. "CREATE_TABLE": CREATE [OR REPLACE] TABLE without AS SELECT. "CREATE_TABLE_AS_SELECT": CREATE [OR REPLACE] TABLE ... AS SELECT ... . "CREATE_VIEW": CREATE [OR REPLACE] VIEW ... AS SELECT ... . "DROP_FUNCTION" : DROP FUNCTION query. "DROP_PROCEDURE": DROP PROCEDURE query. "DROP_TABLE": DROP TABLE query. "DROP_VIEW": DROP VIEW query.
     * 
     */
    @Import(name="statementType", required=true)
      private final String statementType;

    public String statementType() {
        return this.statementType;
    }

    /**
     * [Beta] Describes a timeline of job execution.
     * 
     */
    @Import(name="timeline", required=true)
      private final List<QueryTimelineSampleResponse> timeline;

    public List<QueryTimelineSampleResponse> timeline() {
        return this.timeline;
    }

    /**
     * Total bytes billed for the job.
     * 
     */
    @Import(name="totalBytesBilled", required=true)
      private final String totalBytesBilled;

    public String totalBytesBilled() {
        return this.totalBytesBilled;
    }

    /**
     * Total bytes processed for the job.
     * 
     */
    @Import(name="totalBytesProcessed", required=true)
      private final String totalBytesProcessed;

    public String totalBytesProcessed() {
        return this.totalBytesProcessed;
    }

    /**
     * For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate is unknown. PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
     * 
     */
    @Import(name="totalBytesProcessedAccuracy", required=true)
      private final String totalBytesProcessedAccuracy;

    public String totalBytesProcessedAccuracy() {
        return this.totalBytesProcessedAccuracy;
    }

    /**
     * Total number of partitions processed from all partitioned tables referenced in the job.
     * 
     */
    @Import(name="totalPartitionsProcessed", required=true)
      private final String totalPartitionsProcessed;

    public String totalPartitionsProcessed() {
        return this.totalPartitionsProcessed;
    }

    /**
     * Slot-milliseconds for the job.
     * 
     */
    @Import(name="totalSlotMs", required=true)
      private final String totalSlotMs;

    public String totalSlotMs() {
        return this.totalSlotMs;
    }

    /**
     * Standard SQL only: list of undeclared query parameters detected during a dry run validation.
     * 
     */
    @Import(name="undeclaredQueryParameters", required=true)
      private final List<QueryParameterResponse> undeclaredQueryParameters;

    public List<QueryParameterResponse> undeclaredQueryParameters() {
        return this.undeclaredQueryParameters;
    }

    public JobStatistics2Response(
        BiEngineStatisticsResponse biEngineStatistics,
        Integer billingTier,
        Boolean cacheHit,
        String ddlAffectedRowAccessPolicyCount,
        TableReferenceResponse ddlDestinationTable,
        String ddlOperationPerformed,
        DatasetReferenceResponse ddlTargetDataset,
        RoutineReferenceResponse ddlTargetRoutine,
        RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy,
        TableReferenceResponse ddlTargetTable,
        DmlStatisticsResponse dmlStats,
        String estimatedBytesProcessed,
        MlStatisticsResponse mlStatistics,
        BigQueryModelTrainingResponse modelTraining,
        String numDmlAffectedRows,
        List<ExplainQueryStageResponse> queryPlan,
        List<RoutineReferenceResponse> referencedRoutines,
        List<TableReferenceResponse> referencedTables,
        List<JobStatistics2ReservationUsageItemResponse> reservationUsage,
        TableSchemaResponse schema,
        String statementType,
        List<QueryTimelineSampleResponse> timeline,
        String totalBytesBilled,
        String totalBytesProcessed,
        String totalBytesProcessedAccuracy,
        String totalPartitionsProcessed,
        String totalSlotMs,
        List<QueryParameterResponse> undeclaredQueryParameters) {
        this.biEngineStatistics = Objects.requireNonNull(biEngineStatistics, "expected parameter 'biEngineStatistics' to be non-null");
        this.billingTier = Objects.requireNonNull(billingTier, "expected parameter 'billingTier' to be non-null");
        this.cacheHit = Objects.requireNonNull(cacheHit, "expected parameter 'cacheHit' to be non-null");
        this.ddlAffectedRowAccessPolicyCount = Objects.requireNonNull(ddlAffectedRowAccessPolicyCount, "expected parameter 'ddlAffectedRowAccessPolicyCount' to be non-null");
        this.ddlDestinationTable = Objects.requireNonNull(ddlDestinationTable, "expected parameter 'ddlDestinationTable' to be non-null");
        this.ddlOperationPerformed = Objects.requireNonNull(ddlOperationPerformed, "expected parameter 'ddlOperationPerformed' to be non-null");
        this.ddlTargetDataset = Objects.requireNonNull(ddlTargetDataset, "expected parameter 'ddlTargetDataset' to be non-null");
        this.ddlTargetRoutine = Objects.requireNonNull(ddlTargetRoutine, "expected parameter 'ddlTargetRoutine' to be non-null");
        this.ddlTargetRowAccessPolicy = Objects.requireNonNull(ddlTargetRowAccessPolicy, "expected parameter 'ddlTargetRowAccessPolicy' to be non-null");
        this.ddlTargetTable = Objects.requireNonNull(ddlTargetTable, "expected parameter 'ddlTargetTable' to be non-null");
        this.dmlStats = Objects.requireNonNull(dmlStats, "expected parameter 'dmlStats' to be non-null");
        this.estimatedBytesProcessed = Objects.requireNonNull(estimatedBytesProcessed, "expected parameter 'estimatedBytesProcessed' to be non-null");
        this.mlStatistics = Objects.requireNonNull(mlStatistics, "expected parameter 'mlStatistics' to be non-null");
        this.modelTraining = Objects.requireNonNull(modelTraining, "expected parameter 'modelTraining' to be non-null");
        this.numDmlAffectedRows = Objects.requireNonNull(numDmlAffectedRows, "expected parameter 'numDmlAffectedRows' to be non-null");
        this.queryPlan = Objects.requireNonNull(queryPlan, "expected parameter 'queryPlan' to be non-null");
        this.referencedRoutines = Objects.requireNonNull(referencedRoutines, "expected parameter 'referencedRoutines' to be non-null");
        this.referencedTables = Objects.requireNonNull(referencedTables, "expected parameter 'referencedTables' to be non-null");
        this.reservationUsage = Objects.requireNonNull(reservationUsage, "expected parameter 'reservationUsage' to be non-null");
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
        this.statementType = Objects.requireNonNull(statementType, "expected parameter 'statementType' to be non-null");
        this.timeline = Objects.requireNonNull(timeline, "expected parameter 'timeline' to be non-null");
        this.totalBytesBilled = Objects.requireNonNull(totalBytesBilled, "expected parameter 'totalBytesBilled' to be non-null");
        this.totalBytesProcessed = Objects.requireNonNull(totalBytesProcessed, "expected parameter 'totalBytesProcessed' to be non-null");
        this.totalBytesProcessedAccuracy = Objects.requireNonNull(totalBytesProcessedAccuracy, "expected parameter 'totalBytesProcessedAccuracy' to be non-null");
        this.totalPartitionsProcessed = Objects.requireNonNull(totalPartitionsProcessed, "expected parameter 'totalPartitionsProcessed' to be non-null");
        this.totalSlotMs = Objects.requireNonNull(totalSlotMs, "expected parameter 'totalSlotMs' to be non-null");
        this.undeclaredQueryParameters = Objects.requireNonNull(undeclaredQueryParameters, "expected parameter 'undeclaredQueryParameters' to be non-null");
    }

    private JobStatistics2Response() {
        this.biEngineStatistics = null;
        this.billingTier = null;
        this.cacheHit = null;
        this.ddlAffectedRowAccessPolicyCount = null;
        this.ddlDestinationTable = null;
        this.ddlOperationPerformed = null;
        this.ddlTargetDataset = null;
        this.ddlTargetRoutine = null;
        this.ddlTargetRowAccessPolicy = null;
        this.ddlTargetTable = null;
        this.dmlStats = null;
        this.estimatedBytesProcessed = null;
        this.mlStatistics = null;
        this.modelTraining = null;
        this.numDmlAffectedRows = null;
        this.queryPlan = List.of();
        this.referencedRoutines = List.of();
        this.referencedTables = List.of();
        this.reservationUsage = List.of();
        this.schema = null;
        this.statementType = null;
        this.timeline = List.of();
        this.totalBytesBilled = null;
        this.totalBytesProcessed = null;
        this.totalBytesProcessedAccuracy = null;
        this.totalPartitionsProcessed = null;
        this.totalSlotMs = null;
        this.undeclaredQueryParameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatistics2Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BiEngineStatisticsResponse biEngineStatistics;
        private Integer billingTier;
        private Boolean cacheHit;
        private String ddlAffectedRowAccessPolicyCount;
        private TableReferenceResponse ddlDestinationTable;
        private String ddlOperationPerformed;
        private DatasetReferenceResponse ddlTargetDataset;
        private RoutineReferenceResponse ddlTargetRoutine;
        private RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy;
        private TableReferenceResponse ddlTargetTable;
        private DmlStatisticsResponse dmlStats;
        private String estimatedBytesProcessed;
        private MlStatisticsResponse mlStatistics;
        private BigQueryModelTrainingResponse modelTraining;
        private String numDmlAffectedRows;
        private List<ExplainQueryStageResponse> queryPlan;
        private List<RoutineReferenceResponse> referencedRoutines;
        private List<TableReferenceResponse> referencedTables;
        private List<JobStatistics2ReservationUsageItemResponse> reservationUsage;
        private TableSchemaResponse schema;
        private String statementType;
        private List<QueryTimelineSampleResponse> timeline;
        private String totalBytesBilled;
        private String totalBytesProcessed;
        private String totalBytesProcessedAccuracy;
        private String totalPartitionsProcessed;
        private String totalSlotMs;
        private List<QueryParameterResponse> undeclaredQueryParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatistics2Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.biEngineStatistics = defaults.biEngineStatistics;
    	      this.billingTier = defaults.billingTier;
    	      this.cacheHit = defaults.cacheHit;
    	      this.ddlAffectedRowAccessPolicyCount = defaults.ddlAffectedRowAccessPolicyCount;
    	      this.ddlDestinationTable = defaults.ddlDestinationTable;
    	      this.ddlOperationPerformed = defaults.ddlOperationPerformed;
    	      this.ddlTargetDataset = defaults.ddlTargetDataset;
    	      this.ddlTargetRoutine = defaults.ddlTargetRoutine;
    	      this.ddlTargetRowAccessPolicy = defaults.ddlTargetRowAccessPolicy;
    	      this.ddlTargetTable = defaults.ddlTargetTable;
    	      this.dmlStats = defaults.dmlStats;
    	      this.estimatedBytesProcessed = defaults.estimatedBytesProcessed;
    	      this.mlStatistics = defaults.mlStatistics;
    	      this.modelTraining = defaults.modelTraining;
    	      this.numDmlAffectedRows = defaults.numDmlAffectedRows;
    	      this.queryPlan = defaults.queryPlan;
    	      this.referencedRoutines = defaults.referencedRoutines;
    	      this.referencedTables = defaults.referencedTables;
    	      this.reservationUsage = defaults.reservationUsage;
    	      this.schema = defaults.schema;
    	      this.statementType = defaults.statementType;
    	      this.timeline = defaults.timeline;
    	      this.totalBytesBilled = defaults.totalBytesBilled;
    	      this.totalBytesProcessed = defaults.totalBytesProcessed;
    	      this.totalBytesProcessedAccuracy = defaults.totalBytesProcessedAccuracy;
    	      this.totalPartitionsProcessed = defaults.totalPartitionsProcessed;
    	      this.totalSlotMs = defaults.totalSlotMs;
    	      this.undeclaredQueryParameters = defaults.undeclaredQueryParameters;
        }

        public Builder biEngineStatistics(BiEngineStatisticsResponse biEngineStatistics) {
            this.biEngineStatistics = Objects.requireNonNull(biEngineStatistics);
            return this;
        }
        public Builder billingTier(Integer billingTier) {
            this.billingTier = Objects.requireNonNull(billingTier);
            return this;
        }
        public Builder cacheHit(Boolean cacheHit) {
            this.cacheHit = Objects.requireNonNull(cacheHit);
            return this;
        }
        public Builder ddlAffectedRowAccessPolicyCount(String ddlAffectedRowAccessPolicyCount) {
            this.ddlAffectedRowAccessPolicyCount = Objects.requireNonNull(ddlAffectedRowAccessPolicyCount);
            return this;
        }
        public Builder ddlDestinationTable(TableReferenceResponse ddlDestinationTable) {
            this.ddlDestinationTable = Objects.requireNonNull(ddlDestinationTable);
            return this;
        }
        public Builder ddlOperationPerformed(String ddlOperationPerformed) {
            this.ddlOperationPerformed = Objects.requireNonNull(ddlOperationPerformed);
            return this;
        }
        public Builder ddlTargetDataset(DatasetReferenceResponse ddlTargetDataset) {
            this.ddlTargetDataset = Objects.requireNonNull(ddlTargetDataset);
            return this;
        }
        public Builder ddlTargetRoutine(RoutineReferenceResponse ddlTargetRoutine) {
            this.ddlTargetRoutine = Objects.requireNonNull(ddlTargetRoutine);
            return this;
        }
        public Builder ddlTargetRowAccessPolicy(RowAccessPolicyReferenceResponse ddlTargetRowAccessPolicy) {
            this.ddlTargetRowAccessPolicy = Objects.requireNonNull(ddlTargetRowAccessPolicy);
            return this;
        }
        public Builder ddlTargetTable(TableReferenceResponse ddlTargetTable) {
            this.ddlTargetTable = Objects.requireNonNull(ddlTargetTable);
            return this;
        }
        public Builder dmlStats(DmlStatisticsResponse dmlStats) {
            this.dmlStats = Objects.requireNonNull(dmlStats);
            return this;
        }
        public Builder estimatedBytesProcessed(String estimatedBytesProcessed) {
            this.estimatedBytesProcessed = Objects.requireNonNull(estimatedBytesProcessed);
            return this;
        }
        public Builder mlStatistics(MlStatisticsResponse mlStatistics) {
            this.mlStatistics = Objects.requireNonNull(mlStatistics);
            return this;
        }
        public Builder modelTraining(BigQueryModelTrainingResponse modelTraining) {
            this.modelTraining = Objects.requireNonNull(modelTraining);
            return this;
        }
        public Builder numDmlAffectedRows(String numDmlAffectedRows) {
            this.numDmlAffectedRows = Objects.requireNonNull(numDmlAffectedRows);
            return this;
        }
        public Builder queryPlan(List<ExplainQueryStageResponse> queryPlan) {
            this.queryPlan = Objects.requireNonNull(queryPlan);
            return this;
        }
        public Builder queryPlan(ExplainQueryStageResponse... queryPlan) {
            return queryPlan(List.of(queryPlan));
        }
        public Builder referencedRoutines(List<RoutineReferenceResponse> referencedRoutines) {
            this.referencedRoutines = Objects.requireNonNull(referencedRoutines);
            return this;
        }
        public Builder referencedRoutines(RoutineReferenceResponse... referencedRoutines) {
            return referencedRoutines(List.of(referencedRoutines));
        }
        public Builder referencedTables(List<TableReferenceResponse> referencedTables) {
            this.referencedTables = Objects.requireNonNull(referencedTables);
            return this;
        }
        public Builder referencedTables(TableReferenceResponse... referencedTables) {
            return referencedTables(List.of(referencedTables));
        }
        public Builder reservationUsage(List<JobStatistics2ReservationUsageItemResponse> reservationUsage) {
            this.reservationUsage = Objects.requireNonNull(reservationUsage);
            return this;
        }
        public Builder reservationUsage(JobStatistics2ReservationUsageItemResponse... reservationUsage) {
            return reservationUsage(List.of(reservationUsage));
        }
        public Builder schema(TableSchemaResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public Builder statementType(String statementType) {
            this.statementType = Objects.requireNonNull(statementType);
            return this;
        }
        public Builder timeline(List<QueryTimelineSampleResponse> timeline) {
            this.timeline = Objects.requireNonNull(timeline);
            return this;
        }
        public Builder timeline(QueryTimelineSampleResponse... timeline) {
            return timeline(List.of(timeline));
        }
        public Builder totalBytesBilled(String totalBytesBilled) {
            this.totalBytesBilled = Objects.requireNonNull(totalBytesBilled);
            return this;
        }
        public Builder totalBytesProcessed(String totalBytesProcessed) {
            this.totalBytesProcessed = Objects.requireNonNull(totalBytesProcessed);
            return this;
        }
        public Builder totalBytesProcessedAccuracy(String totalBytesProcessedAccuracy) {
            this.totalBytesProcessedAccuracy = Objects.requireNonNull(totalBytesProcessedAccuracy);
            return this;
        }
        public Builder totalPartitionsProcessed(String totalPartitionsProcessed) {
            this.totalPartitionsProcessed = Objects.requireNonNull(totalPartitionsProcessed);
            return this;
        }
        public Builder totalSlotMs(String totalSlotMs) {
            this.totalSlotMs = Objects.requireNonNull(totalSlotMs);
            return this;
        }
        public Builder undeclaredQueryParameters(List<QueryParameterResponse> undeclaredQueryParameters) {
            this.undeclaredQueryParameters = Objects.requireNonNull(undeclaredQueryParameters);
            return this;
        }
        public Builder undeclaredQueryParameters(QueryParameterResponse... undeclaredQueryParameters) {
            return undeclaredQueryParameters(List.of(undeclaredQueryParameters));
        }        public JobStatistics2Response build() {
            return new JobStatistics2Response(biEngineStatistics, billingTier, cacheHit, ddlAffectedRowAccessPolicyCount, ddlDestinationTable, ddlOperationPerformed, ddlTargetDataset, ddlTargetRoutine, ddlTargetRowAccessPolicy, ddlTargetTable, dmlStats, estimatedBytesProcessed, mlStatistics, modelTraining, numDmlAffectedRows, queryPlan, referencedRoutines, referencedTables, reservationUsage, schema, statementType, timeline, totalBytesBilled, totalBytesProcessed, totalBytesProcessedAccuracy, totalPartitionsProcessed, totalSlotMs, undeclaredQueryParameters);
        }
    }
}
