package cloud.webgen.web.starter.mongo.webnosqlstarter.repository;

import cloud.webgen.web.starter.mongo.webnosqlstarter.model.AuditNoSqlModel;
import cloud.webgen.web.starter.repository.AuditRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AuditNoSqlRepository<T extends AuditNoSqlModel> extends AuditRepository<T> {
}
